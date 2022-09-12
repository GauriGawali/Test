package basic;

import java.util.Scanner;

public class RevoneZero {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter row: ");
	        int r = scanner.nextInt();
	        for (int i = r; i >= 1; i--) 
	        { 
	        	for(int sp=7;sp>=i;sp--)
				{
					System.out.print(" ");
				}
	            for (int j = 1; j <= i; j++) 
	            { 
	            	if(i%2==0)
	            	   continue;
	                if (j % 2 == 1) 
	                {
	                    System.out.print("1 ");
	                }
	                else 
	                {
	                    System.out.print("0 ");
	                }
	            }
	            System.out.println();
	        }
	    

	
	}
}


/*1010101
 10101 
  101  
   1  */ 