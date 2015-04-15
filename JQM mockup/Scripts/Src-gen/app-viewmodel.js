var App = window.App = {};
App.ViewModel = new function() {
    var self =this;

    this.length=
    {
        boundedRange:{
            lower: 2,
            upper: 10
        },
        value : ko.observable(/*set default if applies*/)
    };
    this.variant=
    {
        choices: ['standard', 'sport', 'luxury'],
        value: ko.observable(/*set default if applies*/),
        isOn: ko.observable(false)
    };
    this.engine=
    {
        choices: ['TFSI 1.2', 'TFSI 1.4', 'TFSI 2.02'],
        value: ko.observable(/*set default if applies*/)
    };
    this.fog_lights=
    {
        value: ko.observable(/*set default if applies*/),
        isOn: ko.observable(false)
    };

    this.group_seats= {
        isVisible:ko.deferredPureComputed(function(){
        //Example of evaluating value where value is pointing to enumeration where value will be in an array (select input element)
            return $.inArray("standard", App.ViewModel.variant.value()) > -1;
        }),
        material:
        {
            choices: ['leather', 'cloth'],
            value: ko.observable(/*set default if applies*/)
        },
        colour:
        {
            choices: ['red', 'blue','black'],
            value: ko.observable(/*set default if applies*/),
            isOn: ko.observable(false)
        },
        group_seats2:{
            material:
            {
                choices: ['leather', 'cloth'],
                value: ko.observable(/*set default if applies*/)
            },
            colour:
            {
                choices: ['red', 'blue','black'],
                value: ko.observable(/*set default if applies*/),
                isOn: ko.observable(false)
            }
        }
    };

};