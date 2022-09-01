package forLoop;

import java.util.Scanner;

public class MaxndMinDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		int max =num%10; int min = num%10;
		
		while(num!=0)
		{
			int r=num%10;
			if(r<min)
			
			 min=r;
				 		
			if(r>max)
				max=r;
			num=num/10;
		}
		
		System.out.println(max);
		System.out.println(min);
		

	}


	}


