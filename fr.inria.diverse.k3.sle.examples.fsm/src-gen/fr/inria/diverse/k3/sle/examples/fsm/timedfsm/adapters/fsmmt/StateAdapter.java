package fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.FSM;
import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.Transition;
import fr.inria.diverse.k3.sle.lib.GenericAdapter;
import java.util.List;
import timedfsm.State;

@SuppressWarnings("all")
public class StateAdapter extends GenericAdapter<State> implements fr.inria.diverse.k3.sle.examples.fsm.fsmmt.State {
  public StateAdapter(final State adaptee) {
    super(adaptee) ;
  }
  
  public String getName() {
    return adaptee.getName() ;
  }
  
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  public FSM getOwningFSM() {
    return new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.FSMAdapter(adaptee.getOwningFSM()) ;
  }
  
  public void setOwningFSM(final FSM o) {
    fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.FSMAdapter wrap = (fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.FSMAdapter) o ;
    adaptee.setOwningFSM(wrap.getAdaptee()) ;
  }
  
  public List<Transition> getOutgoingTransition() {
    return new fr.inria.diverse.k3.sle.lib.ListAdapter<
    	fr.inria.diverse.k3.sle.examples.fsm.fsmmt.Transition,
    	timedfsm.Transition
    	>(adaptee.getOutgoingTransition(), fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.TransitionAdapter.class
    ) ;
  }
  
  public List<Transition> getIncomingTransition() {
    return new fr.inria.diverse.k3.sle.lib.ListAdapter<
    	fr.inria.diverse.k3.sle.examples.fsm.fsmmt.Transition,
    	timedfsm.Transition
    	>(adaptee.getIncomingTransition(), fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.TransitionAdapter.class
    ) ;
  }
  
  public void step(final char c) {
    fr.inria.diverse.k3.sle.examples.fsm.TimedStateAspect.step(adaptee, c ) ;
  }
}
