package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AlternatesIndex {
	int sum=0;
	void half(int a[]) {
		 int mid=a.length/2;
		 for(int i=0;i<mid;i++)
		 { sum=sum+a[i];
			
			 
		 }
		 System.out.println(sum);
		 //System.out.println(Arrays.toString(a));	
		 }
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements"+a.length);
		System.out.println("Enter a Array elements:");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
		}
System.out.println(Arrays.toString(a));
		AlternatesIndex ai=new AlternatesIndex();
		ai.half(a);
		
	}

}
