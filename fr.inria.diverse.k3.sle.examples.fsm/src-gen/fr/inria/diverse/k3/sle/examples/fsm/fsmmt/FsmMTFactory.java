package fr.inria.diverse.k3.sle.examples.fsm.fsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.FSM;
import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.State;
import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.Transition;
import fr.inria.diverse.k3.sle.lib.IFactory;

@SuppressWarnings("all")
public interface FsmMTFactory extends IFactory {
  public abstract FSM createFSM();
  
  public abstract State createState();
  
  public abstract Transition createTransition();
}
