/**
 * Created by rlh on 14/04/15.
 */
$(document).ready(function(){
    $("#main").on('pagecreate', function (event, ui) {

        ko.applyBindings(App.ViewModel, this );
    });
    $("#seats").on('pagecreate', function (event, ui) {
        ko.applyBindings(App.ViewModel, this);
    });
});