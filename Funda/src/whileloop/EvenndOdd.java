package whileloop;

import java.util.Scanner;

public class EvenndOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a limit");
		int limit=sc.nextInt();
		int c=1;
		int even;
		while(c<=limit) {
			if(c%2==0)
				{
				System.out.println(c);
				
				}
			c++;	
		}
		}

}
