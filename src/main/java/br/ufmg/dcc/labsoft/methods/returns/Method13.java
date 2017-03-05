package br.ufmg.dcc.labsoft.methods.returns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Method13 {

	//int --> Integer
	public Integer m1(){
		Integer i = 1;
		return i;
	}
	
	//Integer --> int
	public int m2(){
		int i = 2;
		return i;
	}
	
	//List<String> --> String
	public String  m3(){
		 String  list = "";
		 return list;
	}
	
	//List<String> --> List<Integer>
	public List<Integer> m4(){
		 List<Integer>  list = new ArrayList<Integer>();
		 return list;
	}

	//Map<String, String> --> Map<String, Object>
	public Map<String, Object> m5(){
		Map<String, Object> map = new HashMap<String, Object>();
		return map;
	}

}
