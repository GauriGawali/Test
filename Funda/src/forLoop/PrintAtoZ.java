package forLoop;

import java.util.Scanner;


public class PrintAtoZ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no's of rows");
		int r=sc.nextInt();
		int i,j;
		for(i=1;i<=r;i++)
		{ 
			for(j=1;j<=i;j++)
			{
				System.out.print((char)(64+j));
			}
			System.out.println(" ");
		}
	}
}
