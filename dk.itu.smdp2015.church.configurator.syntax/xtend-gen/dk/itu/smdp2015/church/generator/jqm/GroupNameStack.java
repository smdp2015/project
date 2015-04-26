package dk.itu.smdp2015.church.generator.jqm;

import java.util.Stack;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GroupNameStack {
  private final Stack<String> _queue = new Stack<String>();
  
  public String pushLevel(final String name) {
    return this._queue.push(name);
  }
  
  public String popLevel() {
    return this._queue.pop();
  }
  
  public String getFullPath() {
    Iterable<String> _drop = IterableExtensions.<String>drop(this._queue, 1);
    String _firstElement = this._queue.firstElement();
    final Function2<String, String, String> _function = new Function2<String, String, String>() {
      public String apply(final String full, final String it) {
        return (((full + ".") + it) + "()");
      }
    };
    return IterableExtensions.<String, String>fold(_drop, _firstElement, _function);
  }
}
