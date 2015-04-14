/**
 * Created by rlh on 14/04/15.
 */
ko.bindingHandlers.isExpanded = {
    init: function(element, valueAccessor, allBindings, viewModel, bindingContext) {
        // This will be called when the binding is first applied to an element
        // Set up any initial state, event handlers, etc. here

        var value =ko.unwrap(valueAccessor());
        if(value)
            $(element).collapsible( "expand" );
        else
            $(element).collapsible( "collapse" );

        $(element).on( "collapsibleexpand", function( event, ui ) {
            var observableValue = valueAccessor();
            if(ko.isObservable(observableValue))
                observableValue(true);

        } );
        $(element).on( "collapsiblecollapse", function( event, ui ) {
            var observableValue = valueAccessor();
            if(ko.isObservable(observableValue))
                observableValue(false);

        } );

    },
    update: function(element, valueAccessor, allBindings, viewModel, bindingContext) {
        // This will be called once when the binding is first applied to an element,
        // and again whenever any observables/computeds that are accessed change
        // Update the DOM element based on the supplied values here.


    }
};