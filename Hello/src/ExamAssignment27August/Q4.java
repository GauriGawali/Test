package ExamAssignment27August;

import java.util.Arrays;
import java.util.Scanner;

/*
WAP to replace all negative value with its immediate left elements square. Means arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9]
Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].

 */
public class Q4 {
	void replace(int a[],int size) {
		for(int i=0;i<=size-1;i++) {
			if(a[i]<0)
			{ a[i]=a[i-1]*a[i-1];
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Length of array:"+a.length);
		System.out.println("Enter Array Elemnts");
        for(int i=0;i<=size-1;i++)
		 {
			a[i]=sc.nextInt();
		}
        
        Q4 r=new Q4();
        r.replace(a, size);
	}

}
