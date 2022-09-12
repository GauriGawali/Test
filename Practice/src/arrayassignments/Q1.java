package arrayassignments;

import java.util.Scanner;

/*
a. add elements to single dimensional int array
b. print elements from single dimensional int array
 */
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Length of array is:"+a.length);
		System.out.println("Enter Array elements:");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are...");
  
		for(int i=0;i<=a.length-1;i++) {
	 System.out.println(a[i]+" ");
 }
	}
	}


