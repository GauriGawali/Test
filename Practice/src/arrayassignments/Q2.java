package arrayassignments;

import java.util.Scanner;

public class Q2 {
/*
 2. WAJP2 calculate the average value of array elements. 
 */

	void avg(int a[], int size) {
		  int total=0;
		for(int i=0; i<size; i++)
		{
        total = total + a[i];
		}
		 System.out.println("Total is"+total);
		float avg=total/a.length;
        System.out.println("Average of num is:"+avg);}
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Length of array:"+a.length);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Q2 am =new Q2();
		am.avg(a, size);

	}
	}


