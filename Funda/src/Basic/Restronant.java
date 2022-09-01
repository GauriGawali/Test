package Basic;

import java.util.Scanner;

public class Restronant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the restronant name");
		String restronants=sc.next();
		System.out.println("Enter the restronant... "+restronants);
		System.out.println("choose your menu");
		System.out.println("1.vegeterian");
		System.out.println("2.non_Vegeterian");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		 if(choice==1)
		 {
			 int r=200;
			 int d=100;
			 int cold=20;
			 System.out.println("rice is Rs.200...");
			 System.out.println("daalprice is 100...");
			 System.out.println("enter the dish1");
			 String dish1=sc.next();
			 System.out.println("enter the dish2");
			 String dish2=sc.next();
			 int TotalPrice=r+d+cold;
			 System.out.println("TotalPrice is:" +TotalPrice);
			 
		 }
		 if(choice==2)
		 {
			 int motton=600;
			 int bread=100;
			 int cold=20;
			 System.out.println("mutton is Rs.600...");
			 System.out.println(" Bread price is 100...");
			 System.out.println("enter the dish");
			 String dish1=sc.next();
			 System.out.println("enter the dish2");
			 String dish2=sc.next();
			 int TotalPrice=motton+bread+cold;
			 System.out.println("TotalPrice is:" +TotalPrice);
			 
		 }

	}

}
