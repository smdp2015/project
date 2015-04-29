using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChurchConfig.Configuration
{
    public interface ICommonParameter
    {
        string Name { get; set; }
        Func<bool> IsVisible { get; set; }
        Func<bool> Validate { get; set; }
    }

    public abstract class GroupParameter : ICommonParameter
    {
        public string Name { get; set; }
        public Func<bool> IsVisible { get; set; }
        public Func<bool> Validate { get; set; }
    }

    public abstract class BoundedParameter : ICommonParameter
    {
        protected BoundedParameter()
        {
            IsVisible = () => true;
            Validate = () => true;
        }

        public string Name { get; set; }
        public string Description { get; set; }
        public string Id { get; set; }
        public bool Optional { get; set; }
        public Func<bool> IsVisible { get; set; }
        public Func<bool> Validate { get; set; }
    }

    public class EnumeratedParameter : ICommonParameter
    {
        public EnumeratedParameter()
        {
            IsVisible = () => true;
            Validate = () => true;
        }

        public string Value { get; set; }
        public string Name { get; set; }
        public string Description { get; set; }
        public string Id { get; set; }
        public bool Optional { get; set; }
        public List<string> SelectableValues { get; set; }
        public Func<bool> IsVisible { get; set; }
        public Func<bool> Validate { get; set; }
    }

    public class IntParameter : BoundedParameter
    {
        public int Value { get; set; }
        public int UpperBound { get; set; } //is only set on int
        public int LowerBound { get; set; } //is only set on int
    }

    public class BoolParameter : BoundedParameter
    {
        public bool Value { get; set; }
    }

    public class StringParameter : BoundedParameter
    {
        public string Value { get; set; }
    }

    public class Configurator
    {
        public Configurator(ICommonParameter configuration)
        {
            Configuration = configuration;
        }
        public ICommonParameter Configuration { get; private set; }
    }
}
