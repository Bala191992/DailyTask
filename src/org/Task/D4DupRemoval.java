package org.Task;

import java.util.*;

public class D4DupRemoval {

	public static void main(String[] args) {
		
		//18.Duplicate Removal  --> We have to use set-----------------
		
//		List<Integer> li = new ArrayList<>();
//		li.add(10);
//		li.add(20);
//		li.add(40);
//		li.add(20);
//		li.add(30);
//		li.add(10);
//		li.add(50);
//		li.add(20);
//		li.add(60);
//		
//		//We have to move all values of list to set
//		Set<Integer> s = new LinkedHashSet<>(li);
//		System.out.println(s);
		
		
		//18.b.Duplicate Removal  --> We have to use set ------------------
		
//		//Array	------> List ----> set		
//		Integer a[] = {10,30,20,40,20,10,50,80,20,40};
//		
//		//18.b).Converting Array to ArrayList -->using Arrays.asList();
//		//Arrays-Class   	asList() -Method
//		
//		List<Integer> li = new ArrayList<>(Arrays.asList(a)); 
//		System.out.println(li);
//		
//		//Converting list to set
//		
//		Set<Integer> s = new LinkedHashSet<>(li);
//		System.out.println(s);
 
		
		//using Set without List---------------------------------------------
		
//	
//		int a[] = {10,30,20,40,20,10,50,80,20,40};
//		
//		Set<Integer> s = new LinkedHashSet<>();
//		
//		for (int x: a) {
//			s.add(x);
//		}
//		System.out.println("After Removing Duplicates :\n"+s);	
		
		
		
		//Removing Duplicates Character
		
//		String s = "HAPPY DAY...";	
//		
//		Set<Character> se = new LinkedHashSet<>();
//		
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			se.add(ch);
//		}
//		System.out.println("After Removing Duplicates :\n"+se);
		
		
		//20.(Removing Dup Word)
		
//		String s = "has have had has have had";
//		
//		//Split using space 
//		String[] sp = s.split(" ");
//			
//		Set<String> se = new LinkedHashSet<>();
//		
//							
//		for (String word : sp) {
//			se.add(word);
//		}
//		System.out.println("After Removing Duplicates :\n"+se);
		
		//21.Remove dupliactes-->Without using set
		//Here we are going to use list foor removing duplicates
		
		Integer a[] = {10,40,20,40,20,60,50,40};
		
		List<Integer> li = new ArrayList<>(Arrays.asList(a));
		System.out.println("List : \n"+li);
		
		List<Integer> l = new ArrayList<>();
		//iterate li List
		
		for (Integer val : li) {
			if (!l.contains(val)) {
				l.add(val);
			}
		}
		System.out.println("After Removng duplicates :\n"+l);		
		
		
		
		
		
	}
}
