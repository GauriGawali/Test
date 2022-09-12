package classAssignment;

import java.util.Scanner;

/*
1.	String create with “” and with new operator
2.	Compare string using == when “” is present see same reference is there
3.	Compare string using new operator when new is present see different reference is there
4.	Write a Java program to find length of a string.
5.	Write a Java program to concatenate two strings.
6.	Write a Java program to compare two strings.
7.	Write a Java program to convert lowercase string to uppercase.
8.	Write a Java program to copy one string to another string.
9.	WAP to split string into 2 tokens where string is “HELLO$WORLD”
10.	Write a Java program to find first occurrence of a character in a given string.

 */
public class String1To10 {

	public static void main(String[] args) {
		String s="Hi";
		String s2="Hello";
		String s1= new String("Hello");
		String s4= new String("Hello");
		System.out.println(s4 == s1);
		
		System.out.println(s.compareTo(s1));
		System.out.println(s.length());
		System.out.println(s.concat(s4));
		System.out.println(s.compareTo(s1));
		System.out.println(s.toUpperCase());
		//System.out.println(s.copyValueOf());
		String sCopy = String.valueOf(s);
		s1= String.valueOf(s);
		System.out.println(s.split(s4));
		
		 String str = "What are you doing today?";
	        String split[] = str.split(" ", 2);
	        for (String s5: split)
	        
	        System.out.println(s5);
//___________________________________________________________________
	       
	    		String firstCharStr;
	    		char ch;
	    		int i, flag = 0;
	    		
	    		 Scanner sc= new Scanner(System.in);

	    		System.out.print("\nEnter String to Find First Char Occur =  ");
	    		firstCharStr = sc.nextLine();
	    		
	    		System.out.print("\nEnter the Character to Find =  ");
	    		ch = sc.next().charAt(0);
	    		
	    		for(i = 0; i < firstCharStr.length(); i++)
	    		{
	    			if(firstCharStr.charAt(i) ==  ch) {
	    				flag++;
	    				break;
	    			}
	    		}
	    		if(flag == 0) {
	    			System.out.println("\nSorry! We haven't found the Character ");
	    		}
	    		else {
	    			System.out.format("\nThe First Character Occurrence of %c at %d position", 
	    					ch, i);
	    		}
	    	}
	        
	}


