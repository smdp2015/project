/**
 * Created by rlh on 14/04/15.
 */
function submitconfiguration(){
   // App.ViewModel().group_seats.notifySubscribers(App.ViewModel().group_seats())
    //var s = App.ViewModel().group_seats.isValid();

    var isValid =App.ViewModel.isValid();
    if(!isValid)
        App.ViewModel.errors.showAllMessages();
    var mapping = {
        'ignore': ["boundedRange", "choices"]
    }
    var json = ko.mapping.toJS(App.ViewModel,mapping);

    alert(JSON.stringify(json, null, 4));
    //$("#resultdialoglink").click();
    //TODO: replace by some styling/email logic, maybe JSON->XML->XSLT->Mail HTML
};