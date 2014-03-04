package fr.inria.diverse.k3.sle.examples.fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.sle.examples.fsm.TimeException;
import fr.inria.diverse.k3.sle.examples.fsm.TimedFsmAspect;
import fr.inria.diverse.k3.sle.examples.fsm.TimedTransitionAspectTransitionAspectProperties;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import timedfsm.FSM;
import timedfsm.State;
import timedfsm.Transition;

@Aspect(className = Transition.class)
@SuppressWarnings("all")
public class TimedTransitionAspect {
  public static void fire(final Transition _self) {
    _self_ = fr.inria.diverse.k3.sle.examples.fsm.TimedTransitionAspectTransitionAspectContext.getSelf(_self);
    	      _privk3_fire(_self); 
  }
  
  public static boolean timeIsOk(final Transition _self) {
    _self_ = fr.inria.diverse.k3.sle.examples.fsm.TimedTransitionAspectTransitionAspectContext.getSelf(_self);
    	     return _privk3_timeIsOk(_self); 
  }
  
  public static TimedTransitionAspectTransitionAspectProperties _self_;
  
  public static int time(final Transition _self) {
    _self_ = fr.inria.diverse.k3.sle.examples.fsm.TimedTransitionAspectTransitionAspectContext.getSelf(_self);
    	     return _privk3_time(_self); 
  }
  
  public static void time(final Transition _self, final int time) {
    _self_ = fr.inria.diverse.k3.sle.examples.fsm.TimedTransitionAspectTransitionAspectContext.getSelf(_self);
    	      _privk3_time(_self,time); 
  }
  
  protected static void _privk3_fire(final Transition _self) {
    try {
      boolean _timeIsOk = TimedTransitionAspect.timeIsOk(_self);
      if (_timeIsOk) {
        String _output = _self.getOutput();
        String _plus = (_output + "(");
        int _waitingTime = _self.getWaitingTime();
        String _plus_1 = (_plus + Integer.valueOf(_waitingTime));
        String _plus_2 = (_plus_1 + ")");
        InputOutput.<String>print(_plus_2);
        State _source = _self.getSource();
        FSM _owningFSM = _source.getOwningFSM();
        State _target = _self.getTarget();
        TimedFsmAspect.current(_owningFSM, _target);
      } else {
        throw new TimeException();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static boolean _privk3_timeIsOk(final Transition _self) {
    int _time = TimedTransitionAspect.time(_self);
    return (_time == 0);
  }
  
  protected static int _privk3_time(final Transition _self) {
     return fr.inria.diverse.k3.sle.examples.fsm.TimedTransitionAspect._self_.time; 
  }
  
  protected static void _privk3_time(final Transition _self, final int time) {
    fr.inria.diverse.k3.sle.examples.fsm.TimedTransitionAspect._self_.time = time; 
  }
}
