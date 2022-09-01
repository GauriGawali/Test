package Basic;

import java.util.Scanner;

public class DivBy3nd8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num%3==0 && num%8==0)
		{
			System.out.println("num is divisible by 3 and 8");
		}
		else
			System.out.println("num is not divisible by 3 and 8");
	}

}
