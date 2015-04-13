$(document).on("mobileinit", function () {
    //apply overrides here
    $.mobile.toolbar.prototype.options.backBtnText = "Back";
    $.mobile.toolbar.prototype.options.backBtnTheme = "a";
    $.mobile.defaultPageTransition = "slide";
    $(document).on('#main','pagecreate', function (event, ui) {
        var viewModel = new App.ViewModels.MainViewModel();
        ko.applyBindings(viewModel, this);


    });
});