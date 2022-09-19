package forLoop;

import java.util.Scanner;

public class Krishmurti {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		int sum=0;
		int temp=no;
		while(temp!=0) {
			int fact=1;
			int r=temp%10;
			for(int i=1;i<=r;i++) {
				fact=fact*i;
				//System.out.println(fact);
				
			}temp=temp/10;
			sum=sum+fact;
			//System.out.println(sum);
		} 
		
		
		if(sum==no) 
			System.out.println("number is krishmurti");
			else
			
				System.out.println("number is not krishmurti");
			
		}
	}


