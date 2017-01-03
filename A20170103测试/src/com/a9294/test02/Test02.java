/**
 * 
 */
package com.a9294.test02;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/**
 * @author a9294
 * @version 20170103
 */
public class Test02 {
	
	public void combineArray(){
		
		int[] array1 = {1,2,7,10,13,18,21};
		int[] array2 = {2,4,6,8,10,12};
		int[] array3 = {1,2,3,5,8,13,21,34};
		Set<Integer> set = new TreeSet<Integer>();
		for(int i:array1)
			set.add(i);
		for(int j:array2)
			set.add(j);
		for(int k:array3)
			set.add(k);
		System.out.println(Arrays.toString(set.toArray(new Integer[0])));

	}
	
	@Test
	public void test(){
		this.combineArray();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test02 test02 = new Test02();
		test02.combineArray();
	}

}
