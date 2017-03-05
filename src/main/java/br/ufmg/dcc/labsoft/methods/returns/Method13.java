package br.ufmg.dcc.labsoft.methods.returns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Method13 {

	//int --> Integer
	public int m1(){
		int i = 1;
		return i;
	}
	
	//Integer --> int
	public Integer m2(){
		Integer i = 2;
		return i;
	}
	
	//List<String> --> String
	public List<String>  m3(){
		 List<String>  list = new ArrayList<String>();
		 return list;
	}
	
	//List<String> --> List<Integer>
	public List<String> m4(){
		 List<String>  list = new ArrayList<String>();
		 return list;
	}

	//Map<String, String> --> Map<String, Object>
	public Map<String, String> m5(){
		Map<String, String> map = new HashMap<String, String>();
		return map;
	}

}
