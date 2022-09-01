package forLoop;

import java.util.Scanner;

/*
 1
 12
 123
 1234
 
 */
public class Print1121231234 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no of rows");
		int r=sc.nextInt();
		int i,j;
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}

}
