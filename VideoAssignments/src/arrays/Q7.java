package arrays;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to check if elements of an array are same or not it read
//from front or back. E.g.- {2,3,15,15,3,2}.
public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int i,j;
		System.out.println("Enter the size of an Arrays");
		int size=sc.nextInt();
		int a[]=new int[size];
		int i,j=size;
		System.out.println("length of an arrray elements is"+a.length);
		System.out.println("Array element is:");
		for( i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();		
			
		}
		int read=1;
		
for( i=0;i<size/2;i++) {
	if(a[i]!=a[j])
	{read=0;
	break;
		//System.out.println("Arrays are equal");
	}
	else
		j--;
		//System.out.println("Not equal");
}


System.out.println(Arrays.toString(a));		
		
	}

}
