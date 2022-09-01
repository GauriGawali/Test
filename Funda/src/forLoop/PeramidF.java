package forLoop;

import java.util.Scanner;

public class PeramidF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no of rows");
		int r=sc.nextInt();
		System.out.println("enter a space");
		int sp=sc.nextInt();
		//int sp=3;
		for(int i=1;i<=r;i++)
		{
			for(int k=1;k<=sp;k++)
			{
				System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
					
				}
				sp--;
				System.out.println("");
			}
		}
	}


