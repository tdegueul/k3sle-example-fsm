package fr.inria.diverse.k3.sle.examples.fsm;

import fr.inria.diverse.k3.sle.examples.fsm.TimedFsmAspectFSMAspectProperties;
import java.util.Map;
import timedfsm.FSM;

@SuppressWarnings("all")
public class TimedFsmAspectFSMAspectContext {
  public final static TimedFsmAspectFSMAspectContext INSTANCE = new TimedFsmAspectFSMAspectContext();
  
  public static TimedFsmAspectFSMAspectProperties getSelf(final FSM _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.k3.sle.examples.fsm.TimedFsmAspectFSMAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FSM,TimedFsmAspectFSMAspectProperties> map = new java.util.HashMap<timedfsm.FSM, fr.inria.diverse.k3.sle.examples.fsm.TimedFsmAspectFSMAspectProperties>();
  
  public Map<FSM,TimedFsmAspectFSMAspectProperties> getMap() {
    return map;
  }
}
