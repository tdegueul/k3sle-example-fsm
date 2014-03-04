package fr.inria.diverse.k3.sle.examples.fsm;

import fr.inria.diverse.k3.sle.examples.fsm.ExecutableStateAspectStateAspectProperties;
import fsm.State;
import java.util.Map;

@SuppressWarnings("all")
public class ExecutableStateAspectStateAspectContext {
  public final static ExecutableStateAspectStateAspectContext INSTANCE = new ExecutableStateAspectStateAspectContext();
  
  public static ExecutableStateAspectStateAspectProperties getSelf(final State _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.k3.sle.examples.fsm.ExecutableStateAspectStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<State,ExecutableStateAspectStateAspectProperties> map = new java.util.HashMap<fsm.State, fr.inria.diverse.k3.sle.examples.fsm.ExecutableStateAspectStateAspectProperties>();
  
  public Map<State,ExecutableStateAspectStateAspectProperties> getMap() {
    return map;
  }
}
