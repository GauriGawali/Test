package arrays;

import java.util.Scanner;

public class RevArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of Array");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter a length of: "+a.length);
		System.out.println("Enter a array elements");
		for(int i=0;i<=size-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Print elements in reverse order");
		for(int i=size-1;i>0;i--) {
			System.out.println(a[i]+" ");
		}
	}

}
