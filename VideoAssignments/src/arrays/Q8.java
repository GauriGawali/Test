package arrays;

import java.util.Scanner;

//WAP to find the maximum and minimum value in an array.
public class Q8 {
	  void findMinAndMax(int a[])
	    {
	       
	        int max = a[0];
	        int min = a[0];
	 
	       
	        for (int i = 1; i < a.length; i++)
	        {
	            // if the current element is greater than the maximum found so far
	            if (a[i] > max) {
	                max = a[i];
	            }
	 
	            // if the current element is smaller than the minimum found so far
	            else if (a[i] < min) {
	                min = a[i];
	            }
	        }
	 
	        System.out.println("The minimum array element is " + min);
	        System.out.println("The maximum array element is " + max);
	    }
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an Array");
int size=sc.nextInt();
int a[]=new int[size];
System.out.println("length of an Arrays is"+a.length);
System.out.println("Array elements is:");
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}

Q8 mimx=new Q8();
mimx.findMinAndMax(a);
	}
//void findMinAndMax(a);


}