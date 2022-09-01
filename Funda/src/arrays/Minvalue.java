package arrays;

import java.util.Scanner;

public class Minvalue {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
System.out.println("Enter a size of array");
int size=sc.nextInt();
int a[]=new int[size];
System.out.println("length of array:"+a.length);
System.out.println("Enter Array elements");
for(int i =0;i<a.length-1;i++)
{
	a[i]=sc.nextInt();
	}
int min=a[0];
for(int i=1;i<a.length;i++)
{
	if(a[i]<min)
	min=a[i];
	}
System.out.println("minimum value of array elements is:"+min);
	}

}
