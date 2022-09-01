package Basic;

import java.util.Scanner;

public class Q2Circle {
	
	public static void main(String args[])
	{
	    double radius, diameter, circumference, area;
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter radius of circle: ");
	    radius=sc.nextDouble();
	  //calculate diameter circumference and area
	    
	    diameter = 2 * radius;
	    circumference = 2 * 3.14 * radius;
	    area = 3.14 * (radius * radius);

	    
	    System.out.println("Diameter of circle = "+diameter+" units ");
	    System.out.println("Circumference of circle = "+circumference+" units ");
	    System.out.println("Area of circle = "+area+" sq. units ");
	    }
	}

