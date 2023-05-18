package org.SortingMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DemoSortingD5 {
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>(Arrays.asList(60,30,10,40,20,50,40,30));  //Question
		
		//1.To find Minimum number 
		
		Integer min = Collections.min(li);
		System.out.println("To find Minimum number :"+ min);
		
		//2.To find Maximum Number
		
		Integer max = Collections.max(li);
		System.out.println("To find Maximum Number :"+max);
		
		//3.To Print list in Ascending order
		
		Collections.sort(li);
		System.out.println("\nTo Print list in Ascending order  : ");
		for (Integer b : li) {			//Enanced forEach Loopup
			System.out.println(b);
		}
		
		System.out.println("\nTo Print list in Ascending order  : ");
		for (int i = 0; i < li.size(); i++) {
			Integer val1 = li.get(i);
			System.out.println(val1);
		}
		
		//4.To Print list in Descending Order
		System.out.println("\nTo Print list in Descending order  : ");
		for (int i = li.size()-1; i >=0; i--) {
			Integer Inte = li.get(i);
			System.out.println(Inte);
		}
		
		Collections.sort(li);
		
		Collections.reverse(li);
		for (Integer rev : li) {
			System.out.println("To Print Reverse :"+rev);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
