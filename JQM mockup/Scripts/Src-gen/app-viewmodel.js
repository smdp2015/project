var App = window.App = {};
App.ViewModel=  {
    length :
    {
        boundedRange:{
            lower: 2,
            upper: 10
        },
        value : ko.observable(/*set default if applies*/)
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
        value: ko.observable(/*set default if applies*/)
    },
    fog_lights:
    {
        value: ko.observable(/*set default if applies*/),
        isOn: ko.observable(false)
    },
    group_seats:{
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
    }
};