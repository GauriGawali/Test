package whileloop;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		int cnt=0;
		while(no!=0)
		{
			int r=no%10;
			cnt++;
			no=no/10;
		}
		System.out.println("No of digit in number is: " +cnt);

	}

}
 