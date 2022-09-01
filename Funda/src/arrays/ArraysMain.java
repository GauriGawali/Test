package arrays;

import java.util.Scanner;

public class ArraysMain {

	
	void avg(int a[], int size) {
		  int total=0;
		for(int i=0; i<size; i++)
		{
        total = total + a[i];
        System.out.println("Total is"+total);
		}
		
        float avg=total/a.length;
        System.out.println("Average of num is:"+avg);}
		
	// System.out.println(Arrays.toString(a));
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Length of array:"+a.length);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		ArraysMain am =new ArraysMain();
		am.avg(a, size);

	}


	}


