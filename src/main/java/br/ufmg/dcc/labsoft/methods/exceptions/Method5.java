package br.ufmg.dcc.labsoft.methods.exceptions;

import java.io.IOException;

@Deprecated
public class Method5 {

	//ganhou exceção [IllegalArgumentException]
	public void m1() throws IllegalArgumentException{
		
	}
	
	//removeu exceção [IOException, ArithmeticException --> IOException]
	public void m2() throws IOException{
		
	}
	
	//trocou exceção [IOException --> ArithmeticException]
	public void m3() throws ArithmeticException{
		
	}
}
