package fr.inria.diverse.k3.sle.examples.fsm;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.sle.examples.fsm.NoFireableTransition;
import fr.inria.diverse.k3.sle.examples.fsm.NonDeterminism;
import fr.inria.diverse.k3.sle.examples.fsm.TimedStateAspectStateAspectProperties;
import fr.inria.diverse.k3.sle.examples.fsm.TimedTransitionAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import timedfsm.State;
import timedfsm.Transition;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class TimedStateAspect {
  public static void step(final State _self, final char c) {
    _self_ = fr.inria.diverse.k3.sle.examples.fsm.TimedStateAspectStateAspectContext.getSelf(_self);
    	      _privk3_step(_self,c); 
  }
  
  public static TimedStateAspectStateAspectProperties _self_;
  
  protected static void _privk3_step(final State _self, final char c) {
    try {
      EList<Transition> _outgoingTransition = _self.getOutgoingTransition();
      final Function1<Transition,Boolean> _function = new Function1<Transition,Boolean>() {
        public Boolean apply(final Transition it) {
          String _input = it.getInput();
          String _valueOf = String.valueOf(c);
          return Boolean.valueOf(_input.equals(_valueOf));
        }
      };
      final Iterable<Transition> validTrans = IterableExtensions.<Transition>filter(_outgoingTransition, _function);
      boolean _isEmpty = IterableExtensions.isEmpty(validTrans);
      if (_isEmpty) {
        throw new NoFireableTransition();
      }
      int _size = IterableExtensions.size(validTrans);
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        throw new NonDeterminism();
      }
      Transition _head = IterableExtensions.<Transition>head(validTrans);
      TimedTransitionAspect.fire(_head);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
