package whileloop;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter number");
	int no=sc.nextInt();
	int sum=0;
	while(no!=0) {
		int r=no%10;
		sum=sum*10+r;
		no=no/10;
	}
	System.out.println(sum);
	}

	}


