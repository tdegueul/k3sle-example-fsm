package fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.State;
import fr.inria.diverse.k3.sle.lib.GenericAdapter;
import timedfsm.Transition;

@SuppressWarnings("all")
public class TransitionAdapter extends GenericAdapter<Transition> implements fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.Transition {
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
  
  public int getWaitingTime() {
    return adaptee.getWaitingTime() ;
  }
  
  public void setWaitingTime(final int o) {
    adaptee.setWaitingTime(o) ;
  }
  
  public State getSource() {
    return new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.StateAdapter(adaptee.getSource()) ;
  }
  
  public void setSource(final State o) {
    fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.StateAdapter wrap = (fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.StateAdapter) o ;
    adaptee.setSource(wrap.getAdaptee()) ;
  }
  
  public State getTarget() {
    return new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.StateAdapter(adaptee.getTarget()) ;
  }
  
  public void setTarget(final State o) {
    fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.StateAdapter wrap = (fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.StateAdapter) o ;
    adaptee.setTarget(wrap.getAdaptee()) ;
  }
  
  public void fire() {
    fr.inria.diverse.k3.sle.examples.fsm.TimedTransitionAspect.fire(adaptee) ;
  }
  
  public boolean timeIsOk() {
    return fr.inria.diverse.k3.sle.examples.fsm.TimedTransitionAspect.timeIsOk(adaptee) ;
  }
  
  public int time() {
    return fr.inria.diverse.k3.sle.examples.fsm.TimedTransitionAspect.time(adaptee) ;
  }
}
