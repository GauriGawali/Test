package Strings;
/*
1. Create Strings with new operator and without new.
a. Create 2 string using literal and Compare string using == see same
reference is there.
b. Create 2 string using new and Compare string using == see different
reference is there.
 */

public class Q1 {

	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		
		System.out.println(s1== s2);
		
		String s3= new String ("java");
		String s4= new String ("java");
		System.out.println(s3==s4);
		

	}

}
