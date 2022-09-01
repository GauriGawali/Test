package forLoop;

import java.util.Scanner;

public class Printabacbadcba {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows");
		int r=sc.nextInt();
		System.out.println("enter a space");
		int sp=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int k=sp;k>=1;i--)
			{
				System.out.print(" ");
			} 
			sp++;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+j));
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print((char)(64+j));
			}
			//sp++;
			System.out.println();
		}

	}

}
