package ExamAssignment30july;

import java.util.Scanner;

//2.	Draw the patterns create a separate method for each:
public class Q2 {
void star(int row) {
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}

void zerone(int r)
{
	for(int i=1;i<=r;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i%2!=0)
			{
				System.out.print(0);
			}
			else
				System.out.print(1);
		}
		System.out.println();
	}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no of row ");
		int row=sc.nextInt();
		Q2 p=new Q2();
		p.star(row);
System.out.println("Enter a nos of row");
int r=sc.nextInt();
p.zerone(r);
	}

}
