package fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.FSM;
import fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.State;
import fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.TimedFsmMTFactory;
import fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.Transition;
import timedfsm.TimedfsmFactory;

@SuppressWarnings("all")
public class TimedFsmMTFactoryAdapter implements TimedFsmMTFactory {
  private TimedfsmFactory adaptee = timedfsm.TimedfsmFactory.eINSTANCE;
  
  public FSM createFSM() {
    return new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.FSMAdapter(adaptee.createFSM()) ;
  }
  
  public State createState() {
    return new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.StateAdapter(adaptee.createState()) ;
  }
  
  public Transition createTransition() {
    return new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.TransitionAdapter(adaptee.createTransition()) ;
  }
}
