/**
 * 
 */
package com.a9294.test01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * @author a9294
 * @version 20170103
 *
 */
public class Test01 {
	
	public void outputMap(){
		
		Set<String> set = new HashSet<String>();	
		String[] array = {"a9294","haha","20170103","nit","ningboaiban","nanbushangwuqu","1234567890"};		 
		for(String str:array)			
			set.add(str);		
		Map<Integer,List<String>> map = new HashMap<Integer,List<String>>();	
		List<String> list = null;	
	    for(String key:set){    	
	    	if(map.isEmpty()||!map.containsKey(key.length())){    		
	    		list=new ArrayList<String>();	    		
	    		list.add(key);	    		
	    		map.put(key.length(),list);
	    	}else{    		
	    		list=map.get(key.length());   		
	    		list.add(key);    		
	    		map.put(key.length(),list);
	    	}
	    }
	    System.out.println(map);
	}

	@Test
	public void test(){
		this.outputMap();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Test01 test01 = new Test01();
		test01.outputMap();		
	}
}
