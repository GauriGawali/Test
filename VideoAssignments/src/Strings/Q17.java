package Strings;

import java.util.Scanner;

//. Write a program to find out the largest and smallest length word in the
//string “This is an umbrella"
public class Q17 {
public static void largeSmall(String s) {
	String v=" ";
	int count[]=new int[2];
	count[0]=0;
	count[1]=0;
	int j=0;
	for(int i=0;i<(s.length());i++) {
		if(s.charAt(i)==v.charAt(i)) {
			System.out.println( count[j]);
			count[j]=count[j+1];
		}
		else count[j]++;
	}
	
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string sentence");
	String s=sc.next();
	Q17.largeSmall(s);
	}

}
