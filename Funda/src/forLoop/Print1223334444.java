package forLoop;

import java.util.Scanner;

public class Print1223334444 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no of rows");
		int r=sc.nextInt();
	int i,j;
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println(" ");
		}

	}

}
