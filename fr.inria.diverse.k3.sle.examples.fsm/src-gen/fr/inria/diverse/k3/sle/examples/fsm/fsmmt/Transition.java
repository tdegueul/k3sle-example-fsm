package fr.inria.diverse.k3.sle.examples.fsm.fsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.State;

@SuppressWarnings("all")
public interface Transition {
  public String getInput();
  
  public void setInput(final String input);
  
  public String getOutput();
  
  public void setOutput(final String output);
  
  public State getSource();
  
  public void setSource(final State source);
  
  public State getTarget();
  
  public void setTarget(final State target);
  
  public abstract void fire();
}
