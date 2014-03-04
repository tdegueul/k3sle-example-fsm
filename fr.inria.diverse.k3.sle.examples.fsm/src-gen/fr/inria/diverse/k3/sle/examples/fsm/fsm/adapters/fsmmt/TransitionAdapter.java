package fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.State;
import fr.inria.diverse.k3.sle.lib.GenericAdapter;
import fsm.Transition;

@SuppressWarnings("all")
public class TransitionAdapter extends GenericAdapter<Transition> implements fr.inria.diverse.k3.sle.examples.fsm.fsmmt.Transition {
  public TransitionAdapter(final Transition adaptee) {
    super(adaptee) ;
  }
  
  public String getInput() {
    return adaptee.getInput() ;
  }
  
  public void setInput(final String o) {
    adaptee.setInput(o) ;
  }
  
  public String getOutput() {
    return adaptee.getOutput() ;
  }
  
  public void setOutput(final String o) {
    adaptee.setOutput(o) ;
  }
  
  public State getSource() {
    return new fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.StateAdapter(adaptee.getSource()) ;
  }
  
  public void setSource(final State o) {
    fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.StateAdapter wrap = (fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.StateAdapter) o ;
    adaptee.setSource(wrap.getAdaptee()) ;
  }
  
  public State getTarget() {
    return new fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.StateAdapter(adaptee.getTarget()) ;
  }
  
  public void setTarget(final State o) {
    fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.StateAdapter wrap = (fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.StateAdapter) o ;
    adaptee.setTarget(wrap.getAdaptee()) ;
  }
  
  public void fire() {
    fr.inria.diverse.k3.sle.examples.fsm.ExecutableTransitionAspect.fire(adaptee) ;
  }
}
