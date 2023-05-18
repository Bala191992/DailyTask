package org.Task;

public class Day2 {
	public static void main(String[] args) {
		
		//9.Reverse a number
		
//		int num = 78503;  //Output - 30587
//		
//		int rem = 0, rev = 0; 
//		
//		//Unknown iteration use while loop
//		
//		while (num> 0) {
//			
//			//fetch last digit
//			rem = num%10;
//			
//			//multiplying numb
//			
//			rev = (rev*10)+rem;
//			
//			//deleting last digit
//			
//			num = num/10;
//			
//		}
//		System.out.println("After Reverse :" + rev + "\n");		
			
		//10.Palindrome/ Not
		
//		int num = 45678 , number = num;
//		int rem = 0, rev = 0;
//		
//		while (num>0) {
//			
//			rem = num%10;
//			
//			rev = (rev*10)+rem;
//			
//			num = num/10;
//		}
//		System.out.println("Given Number is : " + number);
//		System.out.println("After Reversing : " + rev);		
//		
//		if (number == rev) {
//			System.out.println("Palindrome");
//		} else {
//			System.out.println("Not a Palindrome");
//		}
		
		
		
		//11. Sum  of digit
		
//		int num = 78503, number  = num; //output - 3+0+5+8+7 = 23
//		int rem = 0, rev = 0;
//		
//		while (num>0) {
//			
//			rem = num%10; 
//			rev = rev+rem;
//			num = num/10;
//		}
//		System.out.println("Given Number is : " + number);
//		System.out.println("Sum of Digit : " + rev);
		
		//12.product (multiple)of digit
		
		int num = 78513, number  = num; //output - 3*4*5*8*7 =3360
		int rem = 0, rev = 1;
		
		while (num>0) {
			
			rem = num%10; 
			rev = rev*rem;
			num = num/10;
		}
		System.out.println("Given Number is : " + number);
		System.out.println("product(multiplying) of Digit : " + rev);
		
	}
}
