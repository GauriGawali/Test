package forLoop;

import java.util.Scanner;

public class paramidR {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no of rows");
		int r=sc.nextInt();
	//	//System.out.println("enter a space");
		//int sp=sc.nextInt();
		
		for(int i=r;i>=1;i--)
		{
			for(int k=1;k<=4;k++)
			{
				System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
					
				}
				//sp++;
				System.out.println(" ");
			}

	}

}
