package fr.inria.diverse.k3.sle.examples.fsm;

import fr.inria.diverse.k3.sle.examples.fsm.ExecutableTransitionAspectTransitionAspectProperties;
import fsm.Transition;
import java.util.Map;

@SuppressWarnings("all")
public class ExecutableTransitionAspectTransitionAspectContext {
  public final static ExecutableTransitionAspectTransitionAspectContext INSTANCE = new ExecutableTransitionAspectTransitionAspectContext();
  
  public static ExecutableTransitionAspectTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.k3.sle.examples.fsm.ExecutableTransitionAspectTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transition,ExecutableTransitionAspectTransitionAspectProperties> map = new java.util.HashMap<fsm.Transition, fr.inria.diverse.k3.sle.examples.fsm.ExecutableTransitionAspectTransitionAspectProperties>();
  
  public Map<Transition,ExecutableTransitionAspectTransitionAspectProperties> getMap() {
    return map;
  }
}
