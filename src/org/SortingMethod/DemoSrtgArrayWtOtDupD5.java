package org.SortingMethod;

import java.util.Arrays;

public class DemoSrtgArrayWtOtDupD5 {  //Day5-->08/04/2023

	public static void main(String[] args) {
		
//		int a[] = {30,20,40,50,60,10};
//		
//		Arrays.sort(a);  //After sorting{10,20,30,40,50,60}
//		
//		System.out.println("1St Min  :"+a[0]);
//		System.out.println("3rd Min  :"+a[2]);
//		
//		//Last position a.length-1
//		
//		System.out.println("last Max : "+a[a.length-1]);
//		System.out.println("3rd Max  : "+a[a.length-3]);
		
		int num =24567,  Number = num;
		
		//Delete the last dgit count the increament
		
		int c = 0;
		while (num>0) {
			num = num/10;
			c++;
		}
		System.out.println("No of digit "+num+": "+c);
	}
}
