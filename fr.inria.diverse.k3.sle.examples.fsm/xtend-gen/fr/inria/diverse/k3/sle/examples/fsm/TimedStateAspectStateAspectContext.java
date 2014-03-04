package fr.inria.diverse.k3.sle.examples.fsm;

import fr.inria.diverse.k3.sle.examples.fsm.TimedStateAspectStateAspectProperties;
import java.util.Map;
import timedfsm.State;

@SuppressWarnings("all")
public class TimedStateAspectStateAspectContext {
  public final static TimedStateAspectStateAspectContext INSTANCE = new TimedStateAspectStateAspectContext();
  
  public static TimedStateAspectStateAspectProperties getSelf(final State _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.k3.sle.examples.fsm.TimedStateAspectStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<State,TimedStateAspectStateAspectProperties> map = new java.util.HashMap<timedfsm.State, fr.inria.diverse.k3.sle.examples.fsm.TimedStateAspectStateAspectProperties>();
  
  public Map<State,TimedStateAspectStateAspectProperties> getMap() {
    return map;
  }
}
