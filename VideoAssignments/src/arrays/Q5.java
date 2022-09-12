package arrays;

import java.util.Arrays;
import java.util.Scanner;

//Take 10 integer inputs from user and store them in an array. Now, copy all
//the elements in another array but in reverse order.
public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the elements in array:");
		int a[]=new int[10];
		int i,j;
		for( i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int len=a.length;
		int rev[]=new int[len];
		for( i=0;i<len;i++) {
			rev[i]= a[len-i-1];
		}
		System.out.println("Original Array"+Arrays.toString(a));
		System.out.println("Copied reverse Array:"+Arrays.toString(rev));
		//System.out.println(a[i]);
		//System.out.println(rev[i]);
	}

}
