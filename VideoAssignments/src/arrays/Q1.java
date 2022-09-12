package arrays;
//Take 10 integer inputs from user and store them in an array and print them on screen.

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("length of an array is"+a.length);
		System.out.println("Enter the array elements");
        for(int i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
        
        System.out.println("Array elements are:");
        for(int i=0;i<a.length-1;i++)
        {
        	System.out.println(a[i]);
        }
	}

}
