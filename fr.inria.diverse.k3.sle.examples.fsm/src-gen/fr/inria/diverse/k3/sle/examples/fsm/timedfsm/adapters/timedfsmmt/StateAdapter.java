package fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.FSM;
import fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.Transition;
import fr.inria.diverse.k3.sle.lib.GenericAdapter;
import java.util.List;
import timedfsm.State;

@SuppressWarnings("all")
public class StateAdapter extends GenericAdapter<State> implements fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.State {
  public StateAdapter(final State adaptee) {
    super(adaptee) ;
  }
  
  public String getName() {
    return adaptee.getName() ;
  }
  
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  public int getWaitingTime() {
    return adaptee.getWaitingTime() ;
  }
  
  public void setWaitingTime(final int o) {
    adaptee.setWaitingTime(o) ;
  }
  
  public FSM getOwningFSM() {
    return new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.FSMAdapter(adaptee.getOwningFSM()) ;
  }
  
  public void setOwningFSM(final FSM o) {
    fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.FSMAdapter wrap = (fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.FSMAdapter) o ;
    adaptee.setOwningFSM(wrap.getAdaptee()) ;
  }
  
  public List<Transition> getOutgoingTransition() {
    return new fr.inria.diverse.k3.sle.lib.ListAdapter<
    	fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.Transition,
    	timedfsm.Transition
    	>(adaptee.getOutgoingTransition(), fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.TransitionAdapter.class
    ) ;
  }
  
  public List<Transition> getIncomingTransition() {
    return new fr.inria.diverse.k3.sle.lib.ListAdapter<
    	fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.Transition,
    	timedfsm.Transition
    	>(adaptee.getIncomingTransition(), fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.TransitionAdapter.class
    ) ;
  }
  
  public void step(final char c) {
    fr.inria.diverse.k3.sle.examples.fsm.TimedStateAspect.step(adaptee, c ) ;
  }
}
