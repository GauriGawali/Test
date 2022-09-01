package arrays;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a size of array");
	 int size=sc.nextInt();
	 int a[]=new int[size];
	 System.out.println("length of arrays"+a.length);
	 System.out.println("Enter Array elements");
	 for(int i=0;i<a.length-1;i++) {
		 a[i]=sc.nextInt();
	 }
	
	 int max=a[0];
	 for(int i=0;i<a.length-1;i++) {
		 if(a[i]>max)
			 max=a[i];
	 }
	 System.out.println("Max value of array is:"+max);
	}

}
