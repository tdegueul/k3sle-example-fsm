package fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.FSM;
import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.FsmMTFactory;
import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.State;
import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.Transition;
import timedfsm.TimedfsmFactory;

@SuppressWarnings("all")
public class FsmMTFactoryAdapter implements FsmMTFactory {
  private TimedfsmFactory adaptee = timedfsm.TimedfsmFactory.eINSTANCE;
  
  public FSM createFSM() {
    return new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.FSMAdapter(adaptee.createFSM()) ;
  }
  
  public State createState() {
    return new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.StateAdapter(adaptee.createState()) ;
  }
  
  public Transition createTransition() {
    return new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.TransitionAdapter(adaptee.createTransition()) ;
  }
}
