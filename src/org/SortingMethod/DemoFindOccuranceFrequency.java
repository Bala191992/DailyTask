package org.SortingMethod;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoFindOccuranceFrequency {

//	public static void main(String[] args) { // 11.04.2023
//		// Find the (letter count) Occurrence and Frequency
//
//		String s = "Cucumberclass"; // {C=1,u=,c=1,m=1,b=1,e=1,r=1,l=1,a=1,s=2}
//
//		String StrReplace = s.replace(" ", "").toLowerCase();
//
//		Map<Character, Integer> mp = new LinkedHashMap<>();
//
//		for (int i = 0; i < s.length(); i++) {
//
//			char ch = s.charAt(i);
//
//			if (mp.containsKey(ch)) {
//
//				Integer count = mp.get(ch);
//				mp.put(ch, count + 1);
//			} else {
//				mp.put(ch, 1);
//			}
//		}
//		System.out.println(mp);
//	}

	
	// Find the (Word count) Occurrence and Frequency
	
//	public static void main(String[] args) {
//		
//		String s = "has had have has have had";
//		
//		String[] split = s.split(" ");
//		
//		Map<String, Integer> mp = new LinkedHashMap<>();
//		
//		for (String word : split) {
//			
//			if (mp.containsKey(mp)) {
//				
//				Integer count = mp.get(mp);
//				Integer put = mp.put(word, count+1);
//				
//			} else {
//				 mp.put(word, 1);
//			}
//		}
//		System.out.println(mp+"\n");
//		
//		//to Iterate the string 
//		
//		Set<Entry<String, Integer>> ES = mp.entrySet();
//		
//		for (Entry<String, Integer> entry : ES) {
//			System.out.println(entry);
//		}
//	}
	
	
	public static void main(String[] args) {
		
		int a[] = {20,50,20,10,60,10,20,30,40,30};
		
		Map<Integer, Integer> mp = new LinkedHashMap<>();
				
		for (int i : a) {
			
			if (mp.containsKey(i)){
				
				Integer count = mp.get(i);
				Integer put = mp.put(i, count+1);
				
			} else {
				mp.put(i, 1);
			}
		}
		System.out.println(mp+"\n");
		Set<Entry<Integer, Integer>> ES = mp.entrySet();
		
		for (Entry<Integer, Integer> entry : ES) {
			System.out.println(entry.getKey()+"-------->"+entry.getValue());
		}
	
	}
}
