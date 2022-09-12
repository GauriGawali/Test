package arrays;

import java.util.Scanner;

//2.WAP to print the alternate values from an array
public class Q2 {
void alternate(int a[]) {
	System.out.println("Array elements is:");
    for(int i=0;i<a.length;i++) {
 	   if(i%2!=0)
 		   continue;
 	   System.out.println(a[i]);
    }
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Array size is"+a.length);
		System.out.println("Enter the array element");
       for(int i=0;i<a.length;i++)
       {
    	   a[i]=sc.nextInt();
    	   
       }
       Q2 ae=new Q2();
       ae.alternate(a);
	}

}
