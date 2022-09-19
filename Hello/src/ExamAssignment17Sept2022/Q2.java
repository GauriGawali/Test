package ExamAssignment17Sept2022;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two num");
		int a=sc.nextInt();
		int b=sc.nextInt();
		String s="hellos";
		char c[]=s.toCharArray();
		int c1=a+b;
		System.out.println(c1);
		int arr[]= {1,2,3,4};
		
		try {
	
		
			try {
				
			
				try {
				     System.out.println(c[4]);
				}
			
				catch(ArrayIndexOutOfBoundsException e1)
				{
					e1.printStackTrace();
				}
				
				int c2=a/b;
				System.out.println(c2);
			  }
				catch(ArithmeticException e1)
				{
					e1.printStackTrace();
					
				}
			System.out.println(" ");
		}
			catch(Exception e1)
			{
				e1.printStackTrace();
				
			}
		System.out.println("done");
	

	}
}
