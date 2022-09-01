package Basic;

import java.util.Scanner;

//Write a Java program to calculate area of an equilateral triangle.
public class EqualiteralTrangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of equilateral triangle");
        int a=sc.nextInt();
        double area=(1.732*a*a)/4;
        System.out.println("Area of equilateral Triangle"+area);
	}

}
