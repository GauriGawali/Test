package Strings;

public class Q12 {
//.Write a Java program to replace first occurrence of a character with another in a string (using string function).
		public static void main(String[] args) {
			 String str = "Never Give up!!!";
		       System.out.println("String: "+str);
		       String res = str.replaceFirst("(N)+", "A");
		       System.out.println("String after replacing a character's first occurrence: "+res);
		    
	}

}
