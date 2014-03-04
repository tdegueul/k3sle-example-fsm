package fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.State;
import fr.inria.diverse.k3.sle.lib.GenericAdapter;
import java.util.List;
import timedfsm.FSM;

@SuppressWarnings("all")
public class FSMAdapter extends GenericAdapter<FSM> implements fr.inria.diverse.k3.sle.examples.fsm.fsmmt.FSM {
  public FSMAdapter(final FSM adaptee) {
    super(adaptee) ;
  }
  
  public List<State> getOwnedState() {
    return new fr.inria.diverse.k3.sle.lib.ListAdapter<
    	fr.inria.diverse.k3.sle.examples.fsm.fsmmt.State,
    	timedfsm.State
    	>(adaptee.getOwnedState(), fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.StateAdapter.class
    ) ;
  }
  
  public State getInitialState() {
    return new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.StateAdapter(adaptee.getInitialState()) ;
  }
  
  public void setInitialState(final State o) {
    fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.StateAdapter wrap = (fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.StateAdapter) o ;
    adaptee.setInitialState(wrap.getAdaptee()) ;
  }
  
  public List<State> getFinalState() {
    return new fr.inria.diverse.k3.sle.lib.ListAdapter<
    	fr.inria.diverse.k3.sle.examples.fsm.fsmmt.State,
    	timedfsm.State
    	>(adaptee.getFinalState(), fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.StateAdapter.class
    ) ;
  }
  
  public void execute(final String input) {
    fr.inria.diverse.k3.sle.examples.fsm.TimedFsmAspect.execute(adaptee, input ) ;
  }
  
  public State current() {
    return new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.StateAdapter(fr.inria.diverse.k3.sle.examples.fsm.TimedFsmAspect.current(adaptee)) ;
  }
}
