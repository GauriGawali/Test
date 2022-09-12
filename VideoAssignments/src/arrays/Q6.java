package arrays;

import java.util.Arrays;
import java.util.Scanner;

//.Write a program to find the sum and product of all elements of an array.

public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array elements");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Size of an array is:"+a.length);
		System.out.println("Elements of an array is");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
int sum=0;
int product=1;
for(int i=0;i<a.length;i++) {
	sum=sum+a[i];
	product=product*a[i];
}
System.out.println("Sum of all array elements is:"+sum);
System.out.println("Product of all elements in array is:"+product);
	
	}
}
