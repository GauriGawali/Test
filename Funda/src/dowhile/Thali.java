package dowhile;

import java.util.Scanner;

public class Thali {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch1;
		do {
		System.out.println("1.Maharastrian Thali");
		System.out.println("2.Gujrati Thali");
		System.out.println("3.Bengoli Thali");
		System.out.println("4.Kashmiri Thali");
		System.out.println("5.Kerala Thali");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter a Quantity");
			int q=sc.nextInt();
			int r=250;
			int total=q*r;
			System.out.println("total bill is:" +total) ;
			break;
		case 2:
			System.out.println("Enter a Quantity");
			q=sc.nextInt();
			r=500;
			total=q*r;
			System.out.println("total bill is:" +total) ;
			break;
		case 3:
			System.out.println("Enter a Quantity");
			q=sc.nextInt();
			r=300;
			total=q*r;
			System.out.println("total bill is:" +total) ;
			break;
		case 4:
			System.out.println("Enter a Quantity");
			q=sc.nextInt();
			r=400;
			total=q*r;
			System.out.println("total bill is:" +total) ;
			break;
			default :
				System.out.println("invalid choice");
		}
		
		System.out.println("Do you want to continue"+('y'/'n'));
		ch1=sc.next().charAt(0);

	}
		while(ch1=='y'||ch1=='Y');

}
}