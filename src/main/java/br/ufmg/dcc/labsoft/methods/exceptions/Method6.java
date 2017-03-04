package br.ufmg.dcc.labsoft.methods.exceptions;

import java.io.IOException;

public class Method6 {

	//ganhou exceção [IllegalArgumentException]
	@Deprecated
	public void m1() throws IllegalArgumentException{
		
	}
	
	//removeu exceção [IOException, ArithmeticException --> IOException]
	@Deprecated
	public void m2() throws IOException{
		
	}
	
	//trocou exceção [IOException --> ArithmeticException]
	@Deprecated
	public void m3() throws ArithmeticException{
		
	}
}
