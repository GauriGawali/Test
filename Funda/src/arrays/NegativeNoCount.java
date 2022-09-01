package arrays;

import java.util.Scanner;

public class NegativeNoCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Length of array:"+a.length);
		System.out.println("Enter a array elements");
		for(int i=0;i<=size-1;i++)
		 {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Total negative no are:");
		int c=0;
		for(int i=0;i<=size-1;i++) {
			if(a[i]<0)
			{ c++;
			}
		}
			System.out.println(c+" ");

			
		
		}
		

	

}
