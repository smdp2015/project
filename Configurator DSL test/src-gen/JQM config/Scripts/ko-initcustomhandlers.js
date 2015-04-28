/**
 * Created by rlh on 14/04/15.
 */
ko.bindingHandlers.isExpanded = {
    init: function(element, valueAccessor, allBindings, viewModel, bindingContext) {
        // This will be called when the binding is first applied to an element
        // Set up any initial state, event handlers, etc. here

        var value =ko.unwrap(valueAccessor());
        if(value && $( element ).hasClass("ui-collapsible-collapsed"))
            $(element).collapsible( "expand" );
        else if(!$( element ).hasClass("ui-collapsible-collapsed"))
            $(element).collapsible( "collapse" );

        function trySetValue(value){
            var observableValue = valueAccessor();
            if(ko.isObservable(observableValue))
                observableValue(value);
        }
        $(element).on( "collapsibleexpand", function(){trySetValue(true)});
        $(element).on( "collapsiblecollapse", function(){trySetValue(false)});
    },

    update: function(element, valueAccessor, allBindings, viewModel, bindingContext) {
        // This will be called once when the binding is first applied to an element,
        // and again whenever any observables/computeds that are accessed change
        // Update the DOM element based on the supplied values here.


    }
};