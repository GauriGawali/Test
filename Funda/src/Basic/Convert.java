package Basic;

import java.util.Scanner;

//Write a Java program to enter length in centimeter and convert it into meter and kilometer.

public class Convert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length in centimer");
		double Cm=sc.nextDouble();
    	double M,Km;
		M=Cm/100;
		System.out.println("Length in Meter"+M+"m");
		Km=Cm/100000;
		System.out.println("Length in Kilometer"+Km+"km");

	}

}
