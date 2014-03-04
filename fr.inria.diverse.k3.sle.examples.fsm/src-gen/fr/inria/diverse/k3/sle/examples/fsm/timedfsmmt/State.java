package fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.FSM;
import fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.Transition;
import java.util.List;

@SuppressWarnings("all")
public interface State {
  public String getName();
  
  public void setName(final String name);
  
  public int getWaitingTime();
  
  public void setWaitingTime(final int waitingTime);
  
  public FSM getOwningFSM();
  
  public void setOwningFSM(final FSM owningFSM);
  
  public List<Transition> getOutgoingTransition();
  
  public List<Transition> getIncomingTransition();
  
  public abstract void step(final char c);
}
