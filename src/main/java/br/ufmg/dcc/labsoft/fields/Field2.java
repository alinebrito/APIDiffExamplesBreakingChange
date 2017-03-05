package br.ufmg.dcc.labsoft.fields;

@Deprecated
public class Field2 {
	
	//public --> private
	private int x1;
	
	//normal --> depreciated
	@Deprecated
	public int x2;

	//VALUE_DEFAULT_11 --> VALUE_DEFAULT_22
	public String x3 = "VALUE_DEFAULT_22";
}
