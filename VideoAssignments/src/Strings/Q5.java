package Strings;

import java.util.Scanner;

//5.Write a Java program to count occurrences of a word in a given string.
public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String sentence");
		String sent=sc.next();
		int cnt=0;
		char ch[]=sent.toCharArray();
		 for(int i=0;i<ch.length-1;i++) {
			 if(ch[i]=='a') 
				 cnt++;
		 }
			 System.out.println("number of word is:"+cnt);
		 
	
	
	
	
	}
	
//____________________________________________________________	
	
	String string = "Spring is beautiful but so is winter";
	String word = "is";
	String temp[] = string.split(" ");
	int count = 0;{
	for (int i = 0; i < temp.length; i++) {
	if (word.equals(temp[i]))
	count++;
	}
	System.out.println("The string is: " + string);
	System.out.println("The word " + word + " occurs " + count + " times in the above string");	
	
	
	
	
	}
	
	
	
	
	}


