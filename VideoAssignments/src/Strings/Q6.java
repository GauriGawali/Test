package Strings;

import java.util.Scanner;

//Write a Java program to convert uppercase string to lowercase 
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String contain");
		String sent=sc.next();
		
		System.out.println("Enter a charcter which convert in upper case");
		
		char ch1=sc.next().charAt(0);
		char[] c1=sent.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			if(ch1==c1[i])
			 
	             ch1 = (char) ((int) c1[i] - 32);
		}
	       System.out.println(ch1);
		

	}

}
