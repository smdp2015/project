$(document).on("mobileinit", function () {

    if(window.location.hash) {
        // Fragment exists
        //Disallow starting application from nested page
        document.location.href=window.location.href.split('#')[0];
    }

    //apply overrides here
    $.mobile.toolbar.prototype.options.backBtnText = "Back";
    $.mobile.toolbar.prototype.options.backBtnTheme = "a";
    $.mobile.defaultPageTransition = "slide";
    //SrcGen.initPageBinding();
});