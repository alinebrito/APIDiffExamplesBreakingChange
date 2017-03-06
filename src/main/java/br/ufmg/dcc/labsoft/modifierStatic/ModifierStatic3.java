package br.ufmg.dcc.labsoft.modifierStatic;

public class ModifierStatic3 {
	
	//static --> non-static
	public int x1 = 1;
	
	//non-static --> static
	static public int x2 = 2;
	
	
	//static --> non-static
	public void m1(){
		
	}
	
	//non-static --> static
	static public void m2(){
		
	}

	//static --> non-static
	@Deprecated
	public class Inner1{
		
	}
}
