package fr.inria.diverse.k3.sle.examples.fsm;

import fr.inria.diverse.k3.sle.examples.fsm.ExecutableFsmAspectFSMAspectProperties;
import fsm.FSM;
import java.util.Map;

@SuppressWarnings("all")
public class ExecutableFsmAspectFSMAspectContext {
  public final static ExecutableFsmAspectFSMAspectContext INSTANCE = new ExecutableFsmAspectFSMAspectContext();
  
  public static ExecutableFsmAspectFSMAspectProperties getSelf(final FSM _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.k3.sle.examples.fsm.ExecutableFsmAspectFSMAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FSM,ExecutableFsmAspectFSMAspectProperties> map = new java.util.HashMap<fsm.FSM, fr.inria.diverse.k3.sle.examples.fsm.ExecutableFsmAspectFSMAspectProperties>();
  
  public Map<FSM,ExecutableFsmAspectFSMAspectProperties> getMap() {
    return map;
  }
}
