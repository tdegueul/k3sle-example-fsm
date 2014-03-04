package fr.inria.diverse.k3.sle.examples.fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.sle.examples.fsm.ExecutableFsmAspect;
import fr.inria.diverse.k3.sle.examples.fsm.ExecutableTransitionAspectTransitionAspectProperties;
import fsm.FSM;
import fsm.State;
import fsm.Transition;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class ExecutableTransitionAspect {
  public static void fire(final Transition _self) {
    _self_ = fr.inria.diverse.k3.sle.examples.fsm.ExecutableTransitionAspectTransitionAspectContext.getSelf(_self);
    	      _privk3_fire(_self); 
  }
  
  public static ExecutableTransitionAspectTransitionAspectProperties _self_;
  
  protected static void _privk3_fire(final Transition _self) {
    String _output = _self.getOutput();
    InputOutput.<String>print(_output);
    State _source = _self.getSource();
    FSM _owningFSM = _source.getOwningFSM();
    State _target = _self.getTarget();
    ExecutableFsmAspect.current(_owningFSM, _target);
  }
}
