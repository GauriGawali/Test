package whileloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int no=sc.nextInt();
		int fact=1;
		int i=1;
		while(i<=no)
		{ 
			fact=fact*i;
	        i++;
		}
System.out.println(fact);
	}

}
