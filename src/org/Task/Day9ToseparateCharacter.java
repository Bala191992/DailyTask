package org.Task;

public class Day9ToseparateCharacter {
	public static void main(String[] args) {
		
		//---> Character
		
//		Character c = 'b';
//
//		boolean alphabetic = Character.isAlphabetic(c);		//Alphabetic
//		System.out.println(alphabetic);						//to print
//		
//		boolean UppercaseerCase = Character.isUppercaseerCase(c);
//		System.out.println(UppercaseerCase);
//		
//		boolean LowercaseCase = Character.isLowercaseCase(c);
//		System.out.println(LowercaseCase);
//		
//		boolean digit = Character.isDigit(c);
//		System.out.println(digit);
//		
//		char tochangeUppercaseercase = Character.toUppercaseerCase(c); //To change UpC o/p-> 'f'-F
//		System.out.println(tochangeUppercaseercase);
//		
//		char tochangeLowercasecase = Character.toLowercaseCase(c); //To change LwC o/p-> 'f'-F
//		System.out.println(tochangeLowercasecase);
//		
//		==========================================================================
		
		//To separate vowels & consonant and find the vowels & consonant (using Char)
		
//		String str = "GreenTech123@gmail.com";
//		
//		int v = 0, c=0;						                       //To print the value V-vowels:C=Consonant
//		String vow =" ", con = " ";
//		
//		String s = str.replaceAll("[^A-Za-z]", "").toLowercaseCase();  //this method helps to remve dig&splchar
//		
//		for (int i = 0; i < s.length(); i++) {
//			char chr = s.charAt(i);
//		if (chr == 'a'  || chr =='e' || chr =='i'||chr =='o'||chr =='u') {
//			v++;
//			vow = vow + chr;
//		}
//		else {
//			c++;
//			con = con + chr;
//		}
//		}		
//		System.out.println("Vowels Count   :"+v);
//		System.out.println("Constant Count :"+c);
//		System.out.println("Vowels value   :"+vow);
//		System.out.println("Constant value :"+con);
//		
//		=============================================================================
		
		//To separate Count for UppercaseerCase\LowercaseCase\NumbersCount\SpclCharCount (Using RegEx)
		
//		String str = "GreenTech123@gmail.com";
//		
//		String Uppercaseercase = str.replaceAll("[^A-Z]", "");
//		System.out.println("Uppercaseer Case   : "+Uppercaseercase+"\t"+Uppercaseercase.length());
//		
//		String Lowercasecase = str.replaceAll("[^a-z]", "");
//		System.out.println("LowercaseCase    : "+Lowercasecase+"\t"+Lowercasecase.length());
//		
//		String digit = str.replaceAll("[^0-9]", "");
//		System.out.println("Number count : "+digit+"\t"+digit.length());
//		
//		String SplChar = str.replaceAll("[0-9a-zA-Z]", "");
//		System.out.println("Special Char count : "+SplChar+"\t"+SplChar.length());
//		
//		================================================================================
		
		//To separate Count for UppercaseerCase\LowercaseCase\NumbersCount\SpclCharCount  (Using LadderIf)
		
		
		String str = "GreenTech123@gmail.com";
		
		int up=0,low=0,num=0,spec=0;
		String Uppercase = " ", Lowercase=" ",Number=" ",spcl=" ";
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
		if (Character.isUpperCase(ch)) {
			up++;
			Uppercase=Uppercase+ch+" ";
		}	
		else if (Character.isLowerCase(ch)) {
			low++;
			Lowercase = Lowercase + ch+ "";
		}
		else if (Character.isDigit(ch)) {
			num++;
			Number = Number+ch+"";
		}
		else {
			spec++;
			spcl = spcl+spec;
		}
		}
		
		System.out.println("Uppercaseer Case   : "+up);
		System.out.println("LowercaseCase    : "+low);
		System.out.println("Number of digit   : "+num);
		System.out.println("Special charcout  : "+spec);
		
		System.out.println("\nUppercaseer Case   : "+Uppercase);
		System.out.println("LowercaseCase    : "+Lowercase);
		System.out.println("Number of digit   : "+Number);
		System.out.println("Special charcout  : "+spcl);		
	}
}
