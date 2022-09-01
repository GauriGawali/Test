package whileloop;

import java.util.Scanner;

public class EvenndOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=sc.nextInt();
		int c=0;
		while(c<=limit)
		{
			if(c%2==0)
			{
				System.out.println(c);
			}
			c++;
		}
		System.out.println("All even no done");
	}

}
