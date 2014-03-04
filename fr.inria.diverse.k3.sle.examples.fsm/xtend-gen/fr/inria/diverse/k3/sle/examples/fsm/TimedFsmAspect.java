package fr.inria.diverse.k3.sle.examples.fsm;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.sle.examples.fsm.NoFireableTransition;
import fr.inria.diverse.k3.sle.examples.fsm.NonDeterminism;
import fr.inria.diverse.k3.sle.examples.fsm.TimeException;
import fr.inria.diverse.k3.sle.examples.fsm.TimedFsmAspectFSMAspectProperties;
import fr.inria.diverse.k3.sle.examples.fsm.TimedStateAspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;
import timedfsm.FSM;
import timedfsm.State;

@Aspect(className = FSM.class)
@SuppressWarnings("all")
public class TimedFsmAspect {
  public static void execute(final FSM _self, final String input) {
    _self_ = fr.inria.diverse.k3.sle.examples.fsm.TimedFsmAspectFSMAspectContext.getSelf(_self);
    	      _privk3_execute(_self,input); 
  }
  
  public static TimedFsmAspectFSMAspectProperties _self_;
  
  public static State current(final FSM _self) {
    _self_ = fr.inria.diverse.k3.sle.examples.fsm.TimedFsmAspectFSMAspectContext.getSelf(_self);
    	     return _privk3_current(_self); 
  }
  
  public static void current(final FSM _self, final State current) {
    _self_ = fr.inria.diverse.k3.sle.examples.fsm.TimedFsmAspectFSMAspectContext.getSelf(_self);
    	      _privk3_current(_self,current); 
  }
  
  protected static void _privk3_execute(final FSM _self, final String input) {
    State _current = TimedFsmAspect.current(_self);
    boolean _equals = Objects.equal(_current, null);
    if (_equals) {
      State _initialState = _self.getInitialState();
      TimedFsmAspect.current(_self, _initialState);
    }
    int _length = input.length();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      try {
        State _current_1 = TimedFsmAspect.current(_self);
        char _charAt = input.charAt((i).intValue());
        TimedStateAspect.step(_current_1, _charAt);
      } catch (final Throwable _t) {
        if (_t instanceof NoFireableTransition) {
          final NoFireableTransition e = (NoFireableTransition)_t;
          State _current_2 = TimedFsmAspect.current(_self);
          String _name = _current_2.getName();
          String _plus = ("No fireable transition in " + _name);
          String _plus_1 = (_plus + " for input ");
          char _charAt_1 = input.charAt((i).intValue());
          String _plus_2 = (_plus_1 + Character.valueOf(_charAt_1));
          InputOutput.<String>println(_plus_2);
          return;
        } else if (_t instanceof NonDeterminism) {
          final NonDeterminism e_1 = (NonDeterminism)_t;
          State _current_3 = TimedFsmAspect.current(_self);
          String _name_1 = _current_3.getName();
          String _plus_3 = ("Non-determinism in " + _name_1);
          String _plus_4 = (_plus_3 + " for input ");
          char _charAt_2 = input.charAt((i).intValue());
          String _plus_5 = (_plus_4 + Character.valueOf(_charAt_2));
          InputOutput.<String>println(_plus_5);
          return;
        } else if (_t instanceof TimeException) {
          final TimeException e_2 = (TimeException)_t;
          State _current_4 = TimedFsmAspect.current(_self);
          String _name_2 = _current_4.getName();
          String _plus_6 = ("Time exeption in " + _name_2);
          String _plus_7 = (_plus_6 + " for input ");
          char _charAt_3 = input.charAt((i).intValue());
          String _plus_8 = (_plus_7 + Character.valueOf(_charAt_3));
          InputOutput.<String>println(_plus_8);
          return;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
  
  protected static State _privk3_current(final FSM _self) {
     return fr.inria.diverse.k3.sle.examples.fsm.TimedFsmAspect._self_.current; 
  }
  
  protected static void _privk3_current(final FSM _self, final State current) {
    fr.inria.diverse.k3.sle.examples.fsm.TimedFsmAspect._self_.current = current; 
  }
}
