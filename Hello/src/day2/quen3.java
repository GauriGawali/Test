package day2;

import java.util.Scanner;

//Write a Java program to input any alphabet and check whether it is vowel or consonant.
public class quen3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char x=sc.next().charAt(0);
		if(x=='a')
			System.out.println("alphabet are vowel");
		else if(x=='e')
			System.out.println("alphabet are vowel");
		else if(x=='i')
			System.out.println("alphabet are vowel");
		else if(x=='o')
            System.out.println("alphabet are vowel");
		else if(x=='u')
			System.out.println("alphabet are vowel");
	
	    else
		    System.out.println("alphabet are consonant");*/
		
		
		
	/*	char ch='k';
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		    System.out.println("its vowel"  +  ch);
		else 
			System.out.println(" its consonant "  +  ch);
		
*/
		
		char ch='o';
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is vowel");
			break;
			default:
				System.out.println(ch + " is consonant ");
		}
}
}