using System.Collections.Generic;
using ChurchConfig.Configuration;

namespace ChurchConfig.Configuration
{


    /// <summary>
    /// Parametergroup seats 
    /// 
    /// </summary>
    public class seatsGroupParameter : GroupParameter
    {
        public string Name { get; set; }

        /// <summary>
        /// parameter material
        /// l
        /// </summary>
        public EnumeratedParameter material { get; set; }

        /// <summary>
        /// parameter colour
        /// the seal colour
        /// </summary>
        public EnumeratedParameter colour { get; set; }
    }

    /// <summary>
    /// Parametergroup seats2 
    /// 
    /// </summary>
    public class seats2GroupParameter : GroupParameter
    {
        public string Name { get; set; }

        /// <summary>
        /// parameter material2
        /// 
        /// </summary>
        public EnumeratedParameter material2 { get; set; }

        /// <summary>
        /// parameter l_colour
        /// the seal colour
        /// </summary>
        public EnumeratedParameter l_colour { get; set; }

        /// <summary>
        /// parameter colour2
        /// the seal colour
        /// </summary>
        public EnumeratedParameter colour2 { get; set; }

        /// <summary>
        /// parameter p
        /// 
        /// </summary>
        public IntParameter p { get; set; }
    }

    /// <summary>
    /// Parametergroup carConfig 
    /// 
    /// </summary>
    public class carConfigGroupParameter : GroupParameter
    {
        public string Name { get; set; }

        /// <summary>
        /// parameter Farver
        /// FarveDesc1
        /// </summary>
        public EnumeratedParameter Farver { get; set; }

        /// <summary>
        /// parameter length
        /// length of car
        /// </summary>
        public IntParameter length { get; set; }

        /// <summary>
        /// parameter variant
        /// 
        /// </summary>
        public EnumeratedParameter variant { get; set; }

        /// <summary>
        /// parameter engine
        /// 
        /// </summary>
        public EnumeratedParameter engine { get; set; }

        /// <summary>
        /// parameter fog_lights
        /// 
        /// </summary>
        public EnumeratedParameter fog_lights { get; set; }

        /// <summary>
        /// Parametergroup seats 
        /// 
        /// </summary>
        public seatsGroupParameter seats { get; set; }

        /// <summary>
        /// Parametergroup seats2 
        /// 
        /// </summary>
        public seats2GroupParameter seats2 { get; set; }
    }

    public static class ConfigurationBuilder
    {

        public static Configurator Build()
        {
            var Farver = new EnumeratedParameter
            {
                Name = "Farver",
                Description = "FarveDesc1",
                SelectableValues = new List<string> { "A", "B", "C" }
            };
            Farver.IsVisible = () => true;
            Farver.Validate = () => true;

            var length = new IntParameter
            {
                Name = "length",
                Description = "length of car",
                Optional = false,
                UpperBound = 10,
                LowerBound = 2
            };
            length.IsVisible = () => true;
            length.Validate = () => true;
            var variant = new EnumeratedParameter
            {
                Name = "variant",
                Description = "",
                SelectableValues = new List<string> { "standard", "sport", "luxury" }
            };
            variant.IsVisible = () => true;
            variant.Validate = () => true;

            var engine = new EnumeratedParameter
            {
                Name = "engine",
                Description = "",
                SelectableValues = new List<string> { "TFSI 1.2", "TFSI 1.4", "TFSI 2.0" }
            };
            engine.IsVisible = () => true;
            engine.Validate = () => engine.SelectableValues.Exists(x => x == engine.Value) || variant.Value == "sport";

            var fog_lights = new EnumeratedParameter
            {
                Name = "fog_lights",
                Description = "",
                SelectableValues = new List<string> { "true", "false" }
            };
            fog_lights.IsVisible = () => true;
            fog_lights.Validate = () => true;

            var material = new EnumeratedParameter
            {
                Name = "material",
                Description = "",
                SelectableValues = new List<string> { "leather", "cloth" }
            };
            material.IsVisible = () => true;
            material.Validate = () => true;

            var colour = new EnumeratedParameter
            {
                Name = "colour",
                Description = "the seal colour",
                SelectableValues = new List<string> { "red", "blue", "black" }
            };
            colour.IsVisible = () => true;
            colour.Validate = () => true;

            var seats = new seatsGroupParameter
            {
                Name = "seats",
                material = material,
                colour = colour,
            };
            seats.IsVisible = () => variant.Value != "standard";
            seats.Validate =
                () =>
                    material.Value != "leather" ||
                    colour.SelectableValues.Exists(x => x == colour.Value) && material.Value != "cloth" ||
                    colour.SelectableValues.Exists(x => x == colour.Value);

            var material2 = new EnumeratedParameter
            {
                Name = "material2",
                Description = "",
                SelectableValues = new List<string> { "leather", "cloth" }
            };
            material2.IsVisible = () => true;
            material2.Validate = () => true;

            var l_colour = new EnumeratedParameter
            {
                Name = "l_colour",
                Description = "the seal colour",
                SelectableValues = new List<string> { "red", "black" }
            };
            l_colour.IsVisible = () => material.Value == "leather";
            l_colour.Validate = () => true;

            var colour2 = new EnumeratedParameter
            {
                Name = "colour2",
                Description = "the seal colour",
                SelectableValues = new List<string> { "red", "blue", "black" }
            };
            colour2.IsVisible = () => material.Value == "cloth";
            colour2.Validate = () => true;

            var p = new IntParameter { Name = "p", Description = "", Optional = false, UpperBound = 10, LowerBound = 3 };
            p.IsVisible = () => true;
            p.Validate = () => material2.Value == "leather" && p.Value == 7;
            var seats2 = new seats2GroupParameter
            {
                Name = "seats2",
                material2 = material2,
                l_colour = l_colour,
                colour2 = colour2,
                p = p,
            };
            seats2.IsVisible = () => variant.Value != "standard";
            seats2.Validate = () => true;

            var carConfig = new carConfigGroupParameter
            {
                Name = "carConfig",
                Farver = Farver,
                length = length,
                variant = variant,
                engine = engine,
                fog_lights = fog_lights,
                seats = seats,
                seats2 = seats2,
            };
            carConfig.IsVisible = () => true;
            carConfig.Validate = () => true;

            var model = carConfig;
            return new Configurator(model);
        }
    }
}
