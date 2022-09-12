package Strings;

import java.util.Arrays;
import java.util.Scanner;

/*
14.Write a program to find average of digits in string.
E.g. input string is “a5i9gfj4tabc” output: 6
 */
public class Q14 {
	
public static	void avg(String s) {
	int sum=0;
	int l=s.length();
		System.out.println(l);
		char c[]=s.toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<c.length;i++) {
			sum=sum +c[i];
		}
		int avg=sum/l;
		
		
		System.out.println(avg);}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String sentence");
		String s=sc.next();
		System.out.println(s);
		Q14.avg(s);
	}

}
