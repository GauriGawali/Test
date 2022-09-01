package classObjects;

import java.util.Scanner;

public class Circle {
float circleRadius(float r)
{
	return r*r;
	}
 void cicleArea(float rsq)
{
	 double area=3.14*rsq; 
     System.out.println("Area of circle is"+area);
	}
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
Circle c=new Circle();
System.out.println("Enter a radius of circle");
float r=sc.nextFloat();
float rsq=c.circleRadius(r);
c.cicleArea(rsq);
}

}
 