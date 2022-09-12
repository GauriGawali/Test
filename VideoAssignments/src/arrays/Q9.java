package arrays;

import java.util.Arrays;
import java.util.Scanner;

//WAP to find and count total number of duplicate elements in an array
public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("size of an array is:"+a.length);
		System.out.println("Array elements is:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		int cnt=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
			     cnt++;
			     break;
		
		}
System.out.println("Duplicates elements i n array"+cnt);
	}
		
	}
	}
}

