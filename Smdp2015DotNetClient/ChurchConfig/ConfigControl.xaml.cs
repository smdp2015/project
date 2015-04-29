using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;

// The User Control item template is documented at http://go.microsoft.com/fwlink/?LinkId=234236
using Windows.UI.Xaml.Shapes;
using ChurchConfig.Configuration;

namespace ChurchConfig
{
    public sealed partial class ConfigControl : UserControl
    {
        public ConfigControl()
        {
            this.InitializeComponent();
            var model = ConfigurationBuilder.Build();
            BuildListView(Lv1, model.Configuration);
        }

        private void BuildListView(ListView listView, ICommonParameter commonParameter)
        {
            foreach (var runtimeProperty in commonParameter.GetType().GetRuntimeProperties())
            {

                var intParameter = runtimeProperty.GetValue(commonParameter) as IntParameter;
                if (intParameter != null)
                {
                    AddIntParameter(listView, runtimeProperty, intParameter);
                }


                var enumeratedParameter = runtimeProperty.GetValue(commonParameter) as EnumeratedParameter;
                if (enumeratedParameter != null)
                {
                    AddEmeratedParameter(listView, runtimeProperty, enumeratedParameter);
                }


                if (runtimeProperty.PropertyType == typeof(StringParameter))
                {
                    var value = runtimeProperty.GetValue(commonParameter) as StringParameter;
                    AddStringParameter(listView, runtimeProperty, value);
                }

                if (runtimeProperty.PropertyType == typeof(BoolParameter))
                {

                }

                var propertyGroup = runtimeProperty.GetValue(commonParameter) as GroupParameter;
                if (propertyGroup != null)
                {
                    var childlistView = new ListView { Height = 0 };
                    var listViewItem = new ListViewItem { DataContext = propertyGroup, IsSelected = false };

                    var stackPanel = new StackPanel { Orientation = Orientation.Horizontal };
                    stackPanel.Children.Add(new Rectangle
                    {
                        Width = 10,
                        Height = 50,
                        Fill = new SolidColorBrush(Colors.Beige)
                    });
                    // stackPanel.ChildrenTransitions = new TransitionCollection { new EntranceThemeTransition() };
                    // stackPanel.Transitions = new TransitionCollection { new PaneThemeTransition() };

                    var textBlock = new TextBlock();
                    var binding = new Binding { Path = new PropertyPath("Name"), Mode = BindingMode.OneWay };
                    textBlock.SetBinding(TextBlock.TextProperty, binding);
                    var button = new Button { Content = textBlock, Width = 100 };
                    button.Click += (sender, e) =>
                    {
                        childlistView.Height = double.IsNaN(childlistView.Height) ? 0 : double.NaN;
                    };
                    stackPanel.Children.Add(button);

                    stackPanel.Children.Add(childlistView);

                    listViewItem.Content = stackPanel;
                    listView.Items.Add(listViewItem);
                    BuildListView(childlistView, propertyGroup);
                }


            }

        }

        private void AddIntParameter(ListView listView, PropertyInfo runtimeProperty, IntParameter value)
        {
            var listViewItem = new ListViewItem { DataContext = value, ContentTemplate = IntDataTemplate };
            listView.Items.Add(listViewItem);
        }

        private void AddEmeratedParameter(ListView listView, PropertyInfo runtimeProperty, EnumeratedParameter value)
        {
            var listViewItem = new ListViewItem { DataContext = value, ContentTemplate = EnumeratedDataTemplate };
            listView.Items.Add(listViewItem);
        }

        private void AddBoolParameter(ListView listView, PropertyInfo runtimeProperty, BoolParameter value)
        {
            var listViewItem = new ListViewItem { DataContext = value, ContentTemplate = BoolDataTemplate };
            listView.Items.Add(listViewItem);
        }

        private void AddStringParameter(ListView listView, PropertyInfo runtimeProperty, StringParameter value)
        {
            var listViewItem = new ListViewItem { DataContext = value, ContentTemplate = StringDataTemplate };
            listView.Items.Add(listViewItem);
        }
    }
}
