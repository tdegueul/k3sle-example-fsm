package fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.FsmMT;
import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.FsmMTFactory;
import fr.inria.diverse.k3.sle.lib.GenericAdapter;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class TimedFsmAdapter extends GenericAdapter<Resource> implements FsmMT {
  public TimedFsmAdapter(final Resource a) {
    super(a) ;
  }
  
  public List<Object> getContents() {
    java.util.List<java.lang.Object> ret = new java.util.ArrayList<java.lang.Object>() ;
    
    for (org.eclipse.emf.ecore.EObject o : adaptee.getContents()) {
    if (o instanceof timedfsm.FSM) {
    	timedfsm.FSM wrap = (timedfsm.FSM) o ;
    	ret.add(new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.FSMAdapter(wrap)) ;
    } else
    						if (o instanceof timedfsm.State) {
    	timedfsm.State wrap = (timedfsm.State) o ;
    	ret.add(new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.StateAdapter(wrap)) ;
    } else
    						if (o instanceof timedfsm.Transition) {
    	timedfsm.Transition wrap = (timedfsm.Transition) o ;
    	ret.add(new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.TransitionAdapter(wrap)) ;
    } else
    						 {}
    }
    
    return ret ;
  }
  
  public FsmMTFactory getFactory() {
    return new fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.FsmMTFactoryAdapter() ;
  }
}
