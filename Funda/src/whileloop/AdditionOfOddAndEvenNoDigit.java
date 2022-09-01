  package whileloop;

import java.util.Scanner;

public class AdditionOfOddAndEvenNoDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		int sum=0;
		int sum1=0;
		while(no!=0)
		{
			int r=no%10;
			if(r%2==0)
			{
				sum=sum+r;
			}
			else
			{
				sum1=sum1+r;	
			}
			no=no/10;
		}
		System.out.println("Even digit addition is:" +sum);
		System.out.println("Odd digit Addition is:" +sum1);
	}

}
