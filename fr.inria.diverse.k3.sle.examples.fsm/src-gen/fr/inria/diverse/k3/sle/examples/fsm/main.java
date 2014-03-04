package fr.inria.diverse.k3.sle.examples.fsm;

import fr.inria.diverse.k3.sle.examples.fsm.Fsm;
import fr.inria.diverse.k3.sle.examples.fsm.FsmMT;
import fr.inria.diverse.k3.sle.examples.fsm.TimedFsm;
import fr.inria.diverse.k3.sle.examples.fsm.execute;
import fr.inria.diverse.k3.sle.lib.MetamodelExtensions;

@SuppressWarnings("all")
public class main {
  public static void call() {
    final FsmMT fsm = MetamodelExtensions.<FsmMT, Fsm>load(Fsm.class, "input/Simple.fsm", FsmMT.class);
    final FsmMT tfsm = MetamodelExtensions.<FsmMT, TimedFsm>load(TimedFsm.class, "input/Simple.timedfsm", FsmMT.class);
    execute.call(fsm, "adcdce");
    execute.call(tfsm, "a");
  }
  
  public static void main(final String[] args) {
    org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(
    	fsm.FsmPackage.eNS_URI,
    	fsm.FsmPackage.eINSTANCE
    ) ;
    fr.inria.diverse.k3.sle.lib.AdaptersRegistry.getInstance().registerAdapter(
    	"fr.inria.diverse.k3.sle.examples.fsm.Fsm",
    	"fr.inria.diverse.k3.sle.examples.fsm.FsmMT",
    	fr.inria.diverse.k3.sle.examples.fsm.fsm.adapters.fsmmt.FsmAdapter.class
    ) ;
    org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(
    	timedfsm.TimedfsmPackage.eNS_URI,
    	timedfsm.TimedfsmPackage.eINSTANCE
    ) ;
    fr.inria.diverse.k3.sle.lib.AdaptersRegistry.getInstance().registerAdapter(
    	"fr.inria.diverse.k3.sle.examples.fsm.TimedFsm",
    	"fr.inria.diverse.k3.sle.examples.fsm.FsmMT",
    	fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.fsmmt.TimedFsmAdapter.class
    ) ;
    fr.inria.diverse.k3.sle.lib.AdaptersRegistry.getInstance().registerAdapter(
    	"fr.inria.diverse.k3.sle.examples.fsm.TimedFsm",
    	"fr.inria.diverse.k3.sle.examples.fsm.TimedFsmMT",
    	fr.inria.diverse.k3.sle.examples.fsm.timedfsm.adapters.timedfsmmt.TimedFsmAdapter.class
    ) ;
    org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl()
    ) ;
    
    call() ;
  }
}
