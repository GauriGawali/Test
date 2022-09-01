package whileloop;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=sc.nextInt();
		int c=1;
		while(c<=limit)
		{
			if(c%2!=0)
			{
				System.out.println(c);
			}
			c++;
		}
		System.out.println("All Odd no done");
	}

	}


