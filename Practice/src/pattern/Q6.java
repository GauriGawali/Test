package pattern;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no of rows");
		int r=sc.nextInt();
		int i,j;
		for(i=1;i<=r;i++)
		{    for(int k=1;k<=r-i;k++)
		{
			System.out.print(" ");
		}
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}


	}

}/*
	System.out.println(" ");
} ch--;
	for(int i=r-1;i>=1;i--)
	{ch--;
		for(int k=1;k<=r-i;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(ch+" ");
		}
		
		System.out.println(" ");
	}
}
}*/
