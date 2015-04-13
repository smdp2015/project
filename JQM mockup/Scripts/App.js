var App = window.App = {};
App.ViewModels = {};
$(document).bind('mobileinit', function () {
    // while app is running use App.Service.mockStatistic({ToursCompleted: 45}); to fake backend data from the console
    $(document).on('#main','pagecreate', function (event, ui) {
        var viewModel = new App.ViewModels.MainViewModel();
        ko.applyBindings(viewModel, this);
        alert('asdfh');

    });
});