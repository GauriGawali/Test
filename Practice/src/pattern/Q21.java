package pattern;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
	        System.out.println("Number of rows you want in this pattern?");
	 
	        int rows = scanner.nextInt();
	        System.out.println("----Pattern is----");
	 
	        for (int i = 0; i < rows; i++) 
	        {
	            for (int j = 0; j < rows; j++)
	            {
	                if(i == j)
	                {
	                    System.out.print(i);
	                }
	                else
	                {
	                    System.out.print(0);
	                }
	            }
	 
	            System.out.println();
	        }
	 

	}

}
