package whileloop;

import java.util.Scanner;

public class AdditionOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=sc.nextInt();
		int sum=0;
		int sum1=0;
		int c=1;
		while(c<=limit)
		{if(c%2==0)
			sum=sum+c;
		else
		{
			sum1=sum1+c;
		}
		c++;
		
			
		}
		System.out.println(sum);
System.out.println(sum1);
	}

}
