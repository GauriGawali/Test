package Basic;

import java.util.Scanner;

public class AreaSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. cal Area of circle");
		System.out.println("2. cal Area of rectangle");
		System.out.println("3. cal Area of Triangle");
		System.out.println("4. cal Area of square");
		
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1: System.out.println("Enter the Radius");
		double Ac,Ar,At,As;
		float r=sc.nextFloat();
		Ac=3.142*r*r;
		System.out.println("Area of circle is Ac:=" +Ac);
		break;
		
		case 2:System.out.println("Enter a length and width");
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		Ar=l*b;
		System.out.println("Area of Rectangle is Ar: " +Ar);
		break;
		
		case 3:System.out.println("Enter breath and height");
		float b1=sc.nextFloat();
		float h=sc.nextFloat();
		At=0.5*b1*h;
		System.out.println("Area of Tringle is At:" +At) ;
		break;
		
		case 4:System.out.println("Enter a side");
		float s=sc.nextFloat();
		As=s*s;
		System.out.println("Area of Square is As:" +As);
		break;
		
		default:
			System.out.println("Enter Invalid Choice");
		}
	}

}
