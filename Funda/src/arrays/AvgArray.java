package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AvgArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Length of array:"+a.length);
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		
		int total=0;
	   
		System.out.println(Arrays.toString(a));
		for(int i=0; i<a.length-1; i++)
		{
        	total = total + a[i];
        }
		    System.out.println("Total is"+total);
            float avg=total/a.length;
            System.out.println("Average of num is:"+avg);
		

	}

}
