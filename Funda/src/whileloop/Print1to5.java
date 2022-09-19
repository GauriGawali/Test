package whileloop;

import java.util.Scanner;

//Print 1 to 5 no
public class Print1to5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int c=1;
		int limit=sc.nextInt();
		while(c<=limit)
		{
			System.out.print(c+", ");
			c++;
		}
		System.out.print("Done");

	}

}
