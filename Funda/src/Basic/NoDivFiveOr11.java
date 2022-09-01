package Basic;

import java.util.Scanner;

public class NoDivFiveOr11 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	if(num%5==0 && num%11==0)
	{
		System.out.println("Given no is divisible by 5 & 11");
	}
	else
		System.out.println("No is not divisible by 5 and 11");
	}

}
