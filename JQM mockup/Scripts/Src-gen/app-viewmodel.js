var App = window.App = {};

App.ViewModel = ko.validatedObservable({
    /*showValidationSummary:ko.deferredPureComputed(function(){
        return !App.ViewModel.isValid() && App.ViewModel.errors.isAnyMessageShown();
    }),*/
    currentErrors:ko.observableArray([]),
    isModelValid: ko.deferredPureComputed(function()
    {
        var isValid= App.ViewModel.isValid();

        App.ViewModel().currentErrors(App.ViewModel.errors());
        return isValid;
    },this),
    length:
    {
        boundedRange:{
            lower: 2,
            upper: 10
        },
        value : ko.observable()
            .extend({
                required: {params: true, message: "Length is required"}
            })//if Mandatory
    },
    variant:
    {
        choices: ['standard', 'sport', 'luxury'],
        value: ko.observable(/*set default if applies*/),
        isOn: ko.observable(false)
    },
    engine:
    {
        choices: ['TFSI 1.2', 'TFSI 1.4', 'TFSI 2.02'],
        value: ko.observable()
            .extend({
                validation: {
                    validator: function (val, param) {
                        if(App.ViewModel==null)//not initialized
                            return true;
                        //Expression here:
                        var result =
                            (
                                $.inArray("TFSI 1.2", App.ViewModel().engine.value()) > -1 ||
                                $.inArray("TFSI 1.4", App.ViewModel().engine.value()) > -1
                            ) ||
                            $.inArray("sport", App.ViewModel().variant.value()) > -1
                        return result;

                    },
                    message: "validation error"
                }})
    },
    fog_lights:
    {
        value: ko.observable(/*set default if applies*/),
        isOn: ko.observable(false)
    },

    group_seats: ko.observable({
        isVisible:ko.deferredPureComputed(function(){
        //Example of evaluating value where value is pointing to enumeration where value will be in an array (select input element)
            return $.inArray("standard", App.ViewModel().variant.value()) > -1;
        }),
        material:
        {
            choices: ['leather', 'cloth'],
            value: ko.observable(/!*set default if applies*!/)
        },
        colour:
        {
            choices: ['red', 'blue','black'],
            value: ko.observable(/!*set default if applies*!/),

            isOn: ko.observable(false)
        }
    }).extend({
        validation: {
            validator: function (val, param) {
               if(App.ViewModel==null)//not initialized
                    return true;
                //Expression here:
                var result =
                    $.inArray("leather", App.ViewModel().group_seats().material.value()) == -1 ||
                    (
                        $.inArray("red", App.ViewModel().group_seats().colour.value()) > -1 ||
                        $.inArray("black", App.ViewModel().group_seats().colour.value()) > -1
                    )
                return result;
            },
            message: "groups_seats invalid, leather can only have colour red, black"
        }}).extend({
            validation: {
                validator: function (val, param) {
                    if(App.ViewModel==null)//not initialized
                        return true;
                    //Expression here:
                    var result =
                        $.inArray("cloth", App.ViewModel().group_seats().material.value()) == -1 ||
                        (
                        $.inArray("blue", App.ViewModel().group_seats().colour.value()) > -1 ||
                        $.inArray("black", App.ViewModel().group_seats().colour.value()) > -1
                        )
                    return result;
                },
                message: "invalid seats: cloth can only be blue or black"
            }})

});

//Init special group validations, by resetting objects
App.ViewModel().group_seats(App.ViewModel().group_seats());