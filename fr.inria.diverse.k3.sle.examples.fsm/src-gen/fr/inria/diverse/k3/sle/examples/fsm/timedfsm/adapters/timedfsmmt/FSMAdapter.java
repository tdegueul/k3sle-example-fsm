package fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.State;
import fr.inria.diverse.k3.sle.lib.GenericAdapter;
import java.util.List;
import timedfsm.FSM;

@SuppressWarnings("all")
public class FSMAdapter extends GenericAdapter<FSM> implements fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.FSM {
  public FSMAdapter(final FSM adaptee) {
    super(adaptee) ;
  }
  
  public List<State> getOwnedState() {
    return new fr.inria.diverse.k3.sle.lib.ListAdapter<
    	fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.State,
    	timedfsm.State
    	>(adaptee.getOwnedState(), fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.StateAdapter.class
    ) ;
  }
  
  public State getInitialState() {
    return new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.StateAdapter(adaptee.getInitialState()) ;
  }
  
  public void setInitialState(final State o) {
    fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.StateAdapter wrap = (fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.StateAdapter) o ;
    adaptee.setInitialState(wrap.getAdaptee()) ;
  }
  
  public List<State> getFinalState() {
    return new fr.inria.diverse.k3.sle.lib.ListAdapter<
    	fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.State,
    	timedfsm.State
    	>(adaptee.getFinalState(), fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.StateAdapter.class
    ) ;
  }
  
  public void execute(final String input) {
    fr.inria.diverse.k3.sle.examples.fsm.TimedFsmAspect.execute(adaptee, input ) ;
  }
  
  public State current() {
    return new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.StateAdapter(fr.inria.diverse.k3.sle.examples.fsm.TimedFsmAspect.current(adaptee)) ;
  }
}
