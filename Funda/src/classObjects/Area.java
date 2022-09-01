package classObjects;

import java.util.Scanner;

public class Area {
void areaRectangle(float l,float b)
{
	float Ar=l*b;
	System.out.println("Area of Rectangle:"+Ar);
}
void araCircle(float r)
{ 
	double Ac=3.14*r*r;
	System.out.println("Area of Circle is:"+Ac);
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Area A=new Area();
	
	System.out.println("Enter a lenght and width of rectangle");
	 float l=sc.nextFloat();
	 float b=sc.nextFloat();
	 
	 A.areaRectangle(l, b);
	  System.out.println("Enter a radious of circle");
	  float r=sc.nextFloat();
	  A.araCircle(r);

	}

}
