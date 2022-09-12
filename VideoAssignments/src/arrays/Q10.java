package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
10.Write methods that return the average of an array with following headers
and invoke the method from main
i. public static int average(int[] array).
 */
public class Q10 {
	public static int average(int[] array) {
		int total=0;
		for(int i=0; i<array.length-1; i++)
		{
	    	total = total + array[i];
		 }
		System.out.println("Total is"+total);
	     int average=total/array.length;
	     System.out.println("Average of num is:"+average);
		return average;
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("size of an array is:"+array.length);
		System.out.println("Array elements is:");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(array));
		average(array);
	}

}
