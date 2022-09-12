package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
14.Write a java program to separate zeros from non-zeros in an integer array?
Input Array - [12, 0, 7, 0, 8, 0, 3]
Input Array After moving zeros to end - [12, 7, 8, 3, 0, 0, 0]
 */
public class Q14 {

	
		void negativeFirst(int a[]) {
			int len=a.length;
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length-1;j++)
				{
					if(a[j]>a[j-1])
					{
						int temp=a[j];
						a[j]=a[j-1];
						a[j-1]=temp;
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
