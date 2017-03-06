package br.ufmg.dcc.labsoft.modifierStatic;


public class ModifierStatic7 {

	//non-static --> static
	@Deprecated
	public int x1 = 1;
	
	//non-static --> static
	@Deprecated
	static public int x2 = 2;
	
	
	//static --> non-static
	@Deprecated
	void m1(){
		
	}
	
	//non-static --> static
	@Deprecated
	static public void m2(){
		
	}

}
