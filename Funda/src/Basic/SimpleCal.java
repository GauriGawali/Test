package Basic;

import java.util.Scanner;

public class SimpleCal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number");
		int num1 =sc.nextInt();
		int num2=sc.nextInt();
        System.out.println("Enter the any one operator + - * /");
        char op=sc.next().charAt(0);
        if(op=='+')
        
        	System.out.println(num1+num2);
        
        else if(op=='-')
            System.out.println(num1-num2);
        
        else if(op=='*')
        
        	System.out.println(num1*num2);
        else if(op=='/')
        	System.out.println(num1/num2);
        else
        	System.out.println("invalid operator");
	}

}
