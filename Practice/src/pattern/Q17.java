package pattern;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        System.out.println("Number of rows you want in this pattern?");
 
        int rows = scanner.nextInt();
 
        System.out.println("----Pattern is----");
 
        for (int i = 1; i <= rows; i++) 
        { 
            for (int j = rows; j >= i; j--)
            {
                System.out.print((char)(64+j)+" ");
            }
 
            System.out.println();
        }

	}

}
