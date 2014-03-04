package fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt;

import fr.inria.diverse.k3.sle.examples.fsm.FsmMT;
import fr.inria.diverse.k3.sle.examples.fsm.fsmmt.FsmMTFactory;
import fr.inria.diverse.k3.sle.lib.GenericAdapter;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class FsmAdapter extends GenericAdapter<Resource> implements FsmMT {
  public FsmAdapter(final Resource a) {
    super(a) ;
  }
  
  public List<Object> getContents() {
    java.util.List<java.lang.Object> ret = new java.util.ArrayList<java.lang.Object>() ;
    
    for (org.eclipse.emf.ecore.EObject o : adaptee.getContents()) {
    if (o instanceof fsm.FSM) {
    	fsm.FSM wrap = (fsm.FSM) o ;
    	ret.add(new fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.FSMAdapter(wrap)) ;
    } else
    						if (o instanceof fsm.State) {
    	fsm.State wrap = (fsm.State) o ;
    	ret.add(new fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.StateAdapter(wrap)) ;
    } else
    						if (o instanceof fsm.Transition) {
    	fsm.Transition wrap = (fsm.Transition) o ;
    	ret.add(new fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.TransitionAdapter(wrap)) ;
    } else
    						 {}
    }
    
    return ret ;
  }
  
  public FsmMTFactory getFactory() {
    return new fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.FsmMTFactoryAdapter() ;
  }
}
