package pattern;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
	        System.out.println("Number of rows you want in this pattern?");
	 
	        int rows = scanner.nextInt();
	        System.out.println("----Pattern is----");
	        for (int i = 1; i <= rows; i++) 
	        {
	            for (int j = 1; j <= rows-i; j++)
	            {
	                System.out.print(1);
	            }
	 
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(i);
	            }
	 
	            System.out.println();
	        }

	}

}
