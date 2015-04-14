/**
 * Created by rlh on 14/04/15.
 */
function submitconfiguration(){
    var mapping = {
        'ignore': ["boundedRange", "choices"]
    }
    var json = ko.mapping.toJS(App.ViewModel,mapping);

    alert(JSON.stringify(json, null, 4));
    //TODO: replace by some styling/email logic, maybe JSON->XML->XSLT->Mail HTML
};