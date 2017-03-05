package br.ufmg.dcc.labsoft.fields;

public class Field3 {
	
	//public --> private
	@Deprecated
	public int x1;
	
	//VALUE_DEFAULT_11 --> VALUE_DEFAULT_22
	public String x2 = "VALUE_DEFAULT_11";
	
	//VALUE_DEFAULT_11 --> VALUE_DEFAULT_22
	@Deprecated
	public String x3 = "VALUE_DEFAULT_11";


}
