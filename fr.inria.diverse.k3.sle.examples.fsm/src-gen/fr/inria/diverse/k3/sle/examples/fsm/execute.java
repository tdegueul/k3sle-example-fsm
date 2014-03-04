package fr.inria.diverse.k3.sle.examples.fsm;

import fr.inria.diverse.k3.sle.examples.fsm.FsmMT;
import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.FSM;
import java.util.List;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class execute {
  public static void call(final FsmMT fsm, final String input) {
    List<Object> _contents = fsm.getContents();
    Object _head = IterableExtensions.<Object>head(_contents);
    final FSM root = ((FSM) _head);
    root.execute(input);
    InputOutput.println();
  }
}
