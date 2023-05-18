package org.Task;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		// 13.Factorial
//	Scanner s = new Scanner(System.in);  //Value not mention use scanner option
//	System.out.println("Enter the Number :");
//	int num = s.nextInt();
//	
//	
//	int fact = 1;
//			
//	for (int i = 1; i <=num ; i++) {
//		
//		fact = fact * i;
//	}
//	
//	System.out.println("Factorial of " + num + ":" + fact );

		// 14.Fibonacci Series

//		Scanner s = new Scanner(System.in);		Scanner use panni namma value enter pannalam
//		System.out.println("Enter the Number :");
//		int num = s.nextInt();

//		int a = 0, b = 1 ;		//without scanner la for loop la value kudutha adhu execute agum
//		System.out.print(a + " ");
//		System.out.print(b + " ");
//						  //num
//		for (int i = 1; i <=10; i++) {
//			int c = a+b;
//			System.out.print(c + " ");
//			a = b;
//			b = c;
//		}

		// 15.Reverse a String

		// with pre-defined method(company not prefered to use it)
//		StringBuffer s  = new StringBuffer("Sql");
//		StringBuffer reverse = s.reverse();
//				
//		System.out.println(reverse);

		// 16.String Palindrome / Not(Reverse)
		// 012345
		String s = "Malayalam";
		String res = ""; // Save the varible

		// 1.Initialcation 2.condition checking 4.Decrement
		for (int i = s.length() - 1; i >= 0; i--) {
			// 3.Logic execution
			char letter = s.charAt(i);
			res = res + letter;
		}
		System.out.println("Giver Letter is :" + s);
		System.out.println("After reversing :" + res);

		if (s.equals(res)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}
