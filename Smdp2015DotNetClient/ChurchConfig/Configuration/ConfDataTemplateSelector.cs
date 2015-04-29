using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;

namespace ChurchConfig.Configuration
{
    public class ConfDataTemplateSelector : DataTemplateSelector
    {
        public DataTemplate IntParameterTemplate { get; set; }
        public DataTemplate BoolParameterTemplate { get; set; }
        public DataTemplate StringParameterTemplate { get; set; }
        public DataTemplate EnumParameterTemplate { get; set; }
        public DataTemplate GroupParameterTemplate { get; set; }

        protected override Windows.UI.Xaml.DataTemplate SelectTemplateCore(object item)
        {
            var listViewItem = item as ListViewItem;
            if (listViewItem == null) { return base.SelectTemplateCore(item); }
            if (listViewItem.DataContext.GetType() == typeof(IntParameter))
            {
                return IntParameterTemplate;
            }

            if (listViewItem.DataContext.GetType() == typeof(BoolParameter))
            {
                return BoolParameterTemplate;
            }

            if (listViewItem.DataContext.GetType() == typeof(StringParameter))
            {
                return StringParameterTemplate;
            }

            return base.SelectTemplateCore(item);
        }
    }
}
