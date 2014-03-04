package fr.inria.diverse.k3.sle.examples.fsm.fsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.FSM;
import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.Transition;
import java.util.List;

@SuppressWarnings("all")
public interface State {
  public String getName();
  
  public void setName(final String name);
  
  public FSM getOwningFSM();
  
  public void setOwningFSM(final FSM owningFSM);
  
  public List<Transition> getOutgoingTransition();
  
  public List<Transition> getIncomingTransition();
  
  public abstract void step(final char c);
}
