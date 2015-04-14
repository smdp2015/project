$(document).on("mobileinit", function () {
    //apply overrides here
    $.mobile.toolbar.prototype.options.backBtnText = "Back";
    $.mobile.toolbar.prototype.options.backBtnTheme = "a";
    $.mobile.defaultPageTransition = "slide";
    //SrcGen.initPageBinding();
});