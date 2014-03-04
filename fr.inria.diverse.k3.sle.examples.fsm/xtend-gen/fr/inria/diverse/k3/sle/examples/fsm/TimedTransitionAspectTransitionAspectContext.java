package fr.inria.diverse.k3.sle.examples.fsm;

import fr.inria.diverse.k3.sle.examples.fsm.TimedTransitionAspectTransitionAspectProperties;
import java.util.Map;
import timedfsm.Transition;

@SuppressWarnings("all")
public class TimedTransitionAspectTransitionAspectContext {
  public final static TimedTransitionAspectTransitionAspectContext INSTANCE = new TimedTransitionAspectTransitionAspectContext();
  
  public static TimedTransitionAspectTransitionAspectProperties getSelf(final Transition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.k3.sle.examples.fsm.TimedTransitionAspectTransitionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transition,TimedTransitionAspectTransitionAspectProperties> map = new java.util.HashMap<timedfsm.Transition, fr.inria.diverse.k3.sle.examples.fsm.TimedTransitionAspectTransitionAspectProperties>();
  
  public Map<Transition,TimedTransitionAspectTransitionAspectProperties> getMap() {
    return map;
  }
}
