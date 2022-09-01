package dowhile;

import java.util.Scanner;

public class SimpleCal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
		System.out.println("Enter operator1.addition 2.subtraction 3.multiplication 4.division");
		System.out.println("Enter num1 and num2");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter choice");
		int op=sc.nextInt();
		switch(op)
		{
		case 1: int add=num1+num2;
			System.out.println("num1+num2:=" +add);
			break;
	    case 2: int sub=num1-num2;
		     System.out.println("num1-num2:="+sub);
		     break;
	    case 3: int mul=num1*num2;
		     System.out.println("num1*num2:=" +mul);
		     break;
		case 4: int div=num1/num2;
		     System.out.println("do not enter num2 as zero");
		     System.out.println("division of num1/num2:=" +div);
		}
		System.out.println("do you want to continue"+('y'/'n'));
		  ch=sc.next().charAt(0);
		}
     while(ch =='y' || ch =='Y') ;
	
}
	
	}

