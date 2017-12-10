package br.ufmg.dcc.labsoft.types;

public class Type3 {

	public void test(){
		Type2 type2 = new Type2("test", 123, false);
		type2.method("test", 123, true);
		System.out.println(type2);
	}
}
