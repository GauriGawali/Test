package ExamAssignment10sept;

import java.util.Scanner;

//2.	Write a Java program to find total number of alphabets, digits or special character in a string.
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the string");
		String s=sc.next();
		int cA=0;
		int cD=0;
		int cS=0;
		char ch ;
		for(int i=0;i<s.length();i++) {
			ch = s.charAt(i);
			if(ch>='0' && ch<='9') {
				cD++;}
				else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' ) {
					cA++;
				}
				else {
					cS++;
				}}
			System.out.println("alphabets:"+cA+"\ndigits:"+cD);
			System.out.println("Special character:"+cS);
			
		}

	}



