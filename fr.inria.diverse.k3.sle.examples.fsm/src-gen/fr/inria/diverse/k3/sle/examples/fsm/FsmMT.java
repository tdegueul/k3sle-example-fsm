package fr.inria.diverse.k3.sle.examples.fsm;

import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.FsmMTFactory;
import fr.inria.diverse.k3.sle.lib.IModelType;
import java.util.List;

@SuppressWarnings("all")
public interface FsmMT extends IModelType {
  public abstract List<Object> getContents();
  
  public abstract FsmMTFactory getFactory();
}
