package Basic;

import java.util.Scanner;

public class TempCToF {
	
	
	
	    public static void main(String args[])  {
	        
	        Scanner sc=new Scanner(System.in);
	        
	        
	        System.out.print("Enter temperature in Celsius: ");
	        double cel = sc.nextDouble();
	        
	        double far = 1.8 * cel + 32;
	        
	        if (far > 98.6)
	            System.out.println("Fever");
	        else
	            System.out.println("no Fever");
	    }
	}


