package whileloop;

import java.util.Scanner;

public class AdditionOfDigit {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int no=sc.nextInt();
int sum=0;
while(no!=0)
{
	int r=no%10;
	sum=sum+r;
	no=no/10;
	}
System.out.println("Sum of every digit is : "+sum);
	}

}
