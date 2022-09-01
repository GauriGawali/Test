package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingAss {
	
void sorting(int a[]) {
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

	//void display(int a[]) {

	System.out.println(Arrays.toString(a));
	System.out.println("second highest element:"+a[len-2]);
	System.out.println("third minimum:0"+a[2]);
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
		SortingAss sa=new SortingAss();
		sa.sorting(a);
		

	}

}
