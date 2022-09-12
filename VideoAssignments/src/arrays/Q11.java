package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
WAP to arrange the elements of an given array of integers
where all negative integers appear before all the positive
integers.
*/
public class Q11 {
	void negativeFirst(int a[]) {
		int len=a.length;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
			System.out.println(Arrays.toString(a));
		}
	
		
		
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("length of array:"+a.length);
		System.out.println("Enter Array elements");
		for(int i =0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			}
		Q11  sa=new Q11();
		sa.negativeFirst(a);
		

	}

}
