package Switcha;

import java.util.Scanner;

//.Q3. Write a Java program to input any alphabet and check whether it is vowel or consonant.
public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		switch(ch) {
		case 'a':
		case'e':
		case 'i':
		case 'o':
		case 'u':
		
		{
			System.out.println("vowel");
			break;
		}
		default:{
			System.out.println("consonant");
		}
		}
}
}