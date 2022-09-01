package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceNegNoWithPreDigSquare {

	
	 void replace(int a[],int size) {
			for(int i=0;i<=size-1;i++) {
				if(a[i]<0)
				{ a[i]=a[i-1]*a[i-1];
				}
			}
			System.out.println(Arrays.toString(a));
			
	 }
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Length of array:"+a.length);
		System.out.println("Enter a array elements");
		for(int i=0;i<=size-1;i++)
		 {
			a[i]=sc.nextInt();
		}
		
		ReplaceNegNoWithPreDigSquare rp=new ReplaceNegNoWithPreDigSquare();
	//	rp.replace(a, size);
		//rp.half(a);
		/*for(int i=0;i<=size-1;i++) {
			if(a[i]<0)
			{ a[i]=a[i-1]*a[i-1];
			}
		}
		System.out.println(Arrays.toString(a));*/
		


	}

}
