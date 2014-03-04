package fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.State;
import fr.inria.diverse.k3.sle.lib.GenericAdapter;
import fsm.FSM;
import java.util.List;

@SuppressWarnings("all")
public class FSMAdapter extends GenericAdapter<FSM> implements fr.inria.diverse.k3.sle.examples.fsm.fsmmt.FSM {
  public FSMAdapter(final FSM adaptee) {
    super(adaptee) ;
  }
  
  public List<State> getOwnedState() {
    return new fr.inria.diverse.k3.sle.lib.ListAdapter<
    	fr.inria.diverse.k3.sle.examples.fsm.fsmmt.State,
    	fsm.State
    	>(adaptee.getOwnedState(), fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.StateAdapter.class
    ) ;
  }
  
  public State getInitialState() {
    return new fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.StateAdapter(adaptee.getInitialState()) ;
  }
  
  public void setInitialState(final State o) {
    fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.StateAdapter wrap = (fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.StateAdapter) o ;
    adaptee.setInitialState(wrap.getAdaptee()) ;
  }
  
  public List<State> getFinalState() {
    return new fr.inria.diverse.k3.sle.lib.ListAdapter<
    	fr.inria.diverse.k3.sle.examples.fsm.fsmmt.State,
    	fsm.State
    	>(adaptee.getFinalState(), fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.StateAdapter.class
    ) ;
  }
  
  public void execute(final String input) {
    fr.inria.diverse.k3.sle.examples.fsm.ExecutableFsmAspect.execute(adaptee, input ) ;
  }
  
  public State current() {
    return new fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.StateAdapter(fr.inria.diverse.k3.sle.examples.fsm.ExecutableFsmAspect.current(adaptee)) ;
  }
}
