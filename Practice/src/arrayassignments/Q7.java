package arrayassignments;

import java.util.Scanner;

/*
 . Write two methods that return the average of an array with
following headers.
a. public static int average(int[] array)
b. public static double average(double[] array).
c. Use {1,2,3,4,5,6} , {6.0,3.4,6.4,1.2,4.0} to test the methods 
 */
public class Q7 {
/*	 public static int average(int a [] ) {
	      return a;
	         }

	 public static double average(double a [] ) {
		 return 
}*/
	      

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	 		System.out.println("Enter size of Array");
	 		int size=sc.nextInt();
	 		int a[]=new int[size]; 
	 		System.out.println("Length of array:"+a.length);
	 		for(int i=0;i<a.length;i++) {
	 			a[i]=sc.nextInt();
	 		}
	     
	}

}
