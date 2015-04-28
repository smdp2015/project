/**
 * Created by rlh on 15/04/15.
 */

ko.validation.init(
    {
        grouping:{deep:true},
        decorateInputElement:true,
        insertMessages: false
       // messagesOnModified: true
    }

);

ko.deferredPureComputed = function(evaluatorOrOptions, target, options) {
    options = options || {};

    if (typeof evaluatorOrOptions == "object") {
        evaluatorOrOptions.deferEvaluation = true;
    } else {
        options.deferEvaluation = true;
    }

    return ko.pureComputed(evaluatorOrOptions, target, options);
};