  package day7;

import java.util.Arrays;
import java.util.Scanner;

//calculate the average value of array elements. 
public class Q123 {
	   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();

		int arr[]=new int[size];

		
		System.out.println("Length of array:"+arr.length);
		for(int i=0;i<=arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int total=0;
		for(int i=0; i<arr.length-1; i++){
        	total = total + arr[i];
        }
		System.out.println("Total is"+total);
float avg=total/arr.length;
System.out.println("Average of num is:"+avg);
		

	}
	}


