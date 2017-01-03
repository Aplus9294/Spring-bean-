/**
 * 
 */
package com.a9294.test03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author a9294
 * @version 20170103
 */

public class Test03 {
	
	public static String[] output(String strArray[],Set<String> strSet){
    	List<String> list = new ArrayList<String>(); 
    	for (String str:strArray){
    		for (String endStr:strSet){    			
    			list.add(str + endStr);
    		}
    	}    	
    	return  (String[]) list.toArray(new String[0]);
    }
	
	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		
	    	String[] array = {""};
	    	Set<String> strSet = new HashSet<String>();
	    	strSet.add("a9294");
	    	strSet.add("haha");
	    	strSet.add("20170103");
	    	
	    	Set<String> strSet1 = new HashSet<String>();
	    	strSet1.add("nit");
	    	strSet1.add("ningboaiban");
	    	strSet1.add("nanbushangwuqu");
	    	strSet1.add("zhejiangshengningboshi");
	    	
	    	Set<String> strSet2 = new HashSet<String>();
	    	strSet2.add("China");
	    	strSet2.add("Monday");
	    	strSet2.add("Sunnday");
	    	array =  output(array,strSet);
	    	array =  output(array,strSet1);
	    	array =  output(array,strSet2);

			for (Object s:array)
				System.out.println(s);
			
	}	
}






