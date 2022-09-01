package classObjects;

import java.util.Scanner;

public class SimpleInterest {

	double Cal(float p, float r ,float t)
	{
		double result=p*t*r;
		return result;
	}
	
	void simple(double result)
	{
		double Si=(result)/100;
		System.out.println("Simple Interest is :"+Si);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amcount p,rate of interest r,time period t");
		float p=sc.nextFloat();
		float r=sc.nextFloat();
		float t=sc.nextFloat();
		SimpleInterest SI=new SimpleInterest();
		double result=SI.Cal(p, r, t);
		SI.Cal(p, r, t);
		SI.simple(result);
	}

}
