package fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.FSM;
import fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.State;
import fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.Transition;
import fr.inria.diverse.k3.sle.lib.IFactory;

@SuppressWarnings("all")
public interface TimedFsmMTFactory extends IFactory {
  public abstract FSM createFSM();
  
  public abstract State createState();
  
  public abstract Transition createTransition();
}
