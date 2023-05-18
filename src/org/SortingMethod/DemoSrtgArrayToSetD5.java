package org.SortingMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DemoSrtgArrayToSetD5 {
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>(Arrays.asList(60,30,10,40,20,50,40,30));  //Question
		System.out.println("Question : \n"+li);
		
		Set<Integer> se = new TreeSet<>(li);
		System.out.println("\nAfter Sorting & Removing Duplicates  :\n"+se);
		
		List<Integer> lis = new ArrayList<>(se);
		
		//1.To find minimm Number
		
		Integer firstMinimum = lis.get(0);
		System.out.println("\n1st Minimuum Number :"+firstMinimum);
		
		//2.To find Maximum Number
		
		Integer LastMax = lis.get(lis.size()-1);
		System.out.println("\nLast Maximum Number :"+LastMax);
		
		//3.To find 3rd Minimum Number
		Integer ThirdMin = lis.get(2);
		System.out.println("\n3rd Minimum number :"+ThirdMin);
		
		//4.To find 3rd Maximum Number
		
		Integer ThirdMax = lis.get(lis.size()-3);
		System.out.println("\n3rd Maximum Number :"+ThirdMax);
		
		
		
	}

}
