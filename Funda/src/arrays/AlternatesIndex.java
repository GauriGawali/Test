package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AlternatesIndex {
	void half(int a[]) {
		 int mid;
		 for(int i=0;i<a.length;i++)
		 {
			 
		 }
		 System.out.println(Arrays.toString(a));	 }
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements"+a.length);
		System.out.println("Enter a Array elements:");
		for(int i=0;i<=a.length;i++) {
			a[i]=sc.nextInt();
		}
System.out.println(Arrays.toString(a));
		AlternatesIndex ai=new AlternatesIndex();
		ai.half(a);
		
	}

}
