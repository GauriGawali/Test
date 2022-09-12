package pattern;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Enter a num of rows: ");
		    int r=sc.nextInt();
		 
		    for(int i=r;i>=1;i--) 
		    {
		      for(int j=i;j<=r-1;j++) 
		      {
		        System.out.print(" ");
		        
	          }
		     for(int j=1;j<=i;j++)
		      {
		    	  System.out.print(j);
		    	  }
		     for(int j=i-1;j>=1;j--)
		      {
		    	  System.out.print(j);
		      }
		      System.out.println();
		      }


	}

}
