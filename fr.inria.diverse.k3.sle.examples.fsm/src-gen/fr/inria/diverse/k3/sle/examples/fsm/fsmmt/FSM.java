package fr.inria.diverse.k3.sle.examples.fsm.fsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.State;
import java.util.List;

@SuppressWarnings("all")
public interface FSM {
  public List<State> getOwnedState();
  
  public State getInitialState();
  
  public void setInitialState(final State initialState);
  
  public List<State> getFinalState();
  
  public abstract void execute(final String input);
  
  public abstract State current();
}
