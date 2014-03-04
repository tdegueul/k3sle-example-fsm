package fr.inria.diverse.k3.sle.examples.fsm;

import fr.inria.diverse.k3.sle.examples.fsm.timedfsmmt.TimedFsmMTFactory;
import fr.inria.diverse.k3.sle.lib.IModelType;
import java.util.List;

@SuppressWarnings("all")
public interface TimedFsmMT extends IModelType {
  public abstract List<Object> getContents();
  
  public abstract TimedFsmMTFactory getFactory();
}
