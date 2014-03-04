package fr.inria.diverse.k3.sle.examples.fsm;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.sle.examples.fsm.ExecutableFsmAspectFSMAspectProperties;
import fr.inria.diverse.k3.sle.examples.fsm.ExecutableStateAspect;
import fr.inria.diverse.k3.sle.examples.fsm.NoFireableTransition;
import fr.inria.diverse.k3.sle.examples.fsm.NonDeterminism;
import fsm.FSM;
import fsm.State;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = FSM.class)
@SuppressWarnings("all")
public class ExecutableFsmAspect {
  public static void execute(final FSM _self, final String input) {
    _self_ = fr.inria.diverse.k3.sle.examples.fsm.ExecutableFsmAspectFSMAspectContext.getSelf(_self);
    	      _privk3_execute(_self,input); 
  }
  
  public static ExecutableFsmAspectFSMAspectProperties _self_;
  
  public static State current(final FSM _self) {
    _self_ = fr.inria.diverse.k3.sle.examples.fsm.ExecutableFsmAspectFSMAspectContext.getSelf(_self);
    	     return _privk3_current(_self); 
  }
  
  public static void current(final FSM _self, final State current) {
    _self_ = fr.inria.diverse.k3.sle.examples.fsm.ExecutableFsmAspectFSMAspectContext.getSelf(_self);
    	      _privk3_current(_self,current); 
  }
  
  protected static void _privk3_execute(final FSM _self, final String input) {
    State _current = ExecutableFsmAspect.current(_self);
    boolean _equals = Objects.equal(_current, null);
    if (_equals) {
      State _initialState = _self.getInitialState();
      ExecutableFsmAspect.current(_self, _initialState);
    }
    int _length = input.length();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      try {
        State _current_1 = ExecutableFsmAspect.current(_self);
        char _charAt = input.charAt((i).intValue());
        ExecutableStateAspect.step(_current_1, _charAt);
      } catch (final Throwable _t) {
        if (_t instanceof NoFireableTransition) {
          final NoFireableTransition e = (NoFireableTransition)_t;
          State _current_2 = ExecutableFsmAspect.current(_self);
          String _name = _current_2.getName();
          String _plus = ("No fireable transition in " + _name);
          String _plus_1 = (_plus + " for input ");
          char _charAt_1 = input.charAt((i).intValue());
          String _plus_2 = (_plus_1 + Character.valueOf(_charAt_1));
          InputOutput.<String>println(_plus_2);
          return;
        } else if (_t instanceof NonDeterminism) {
          final NonDeterminism e_1 = (NonDeterminism)_t;
          State _current_3 = ExecutableFsmAspect.current(_self);
          String _name_1 = _current_3.getName();
          String _plus_3 = ("Non-determinism in " + _name_1);
          String _plus_4 = (_plus_3 + " for input ");
          char _charAt_2 = input.charAt((i).intValue());
          String _plus_5 = (_plus_4 + Character.valueOf(_charAt_2));
          InputOutput.<String>println(_plus_5);
          return;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
  
  protected static State _privk3_current(final FSM _self) {
     return fr.inria.diverse.k3.sle.examples.fsm.ExecutableFsmAspect._self_.current; 
  }
  
  protected static void _privk3_current(final FSM _self, final State current) {
    fr.inria.diverse.k3.sle.examples.fsm.ExecutableFsmAspect._self_.current = current; 
  }
}
