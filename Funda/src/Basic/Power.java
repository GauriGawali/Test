package Basic;

import java.util.Scanner;

//Write a Java program to find power of any number x ^ y.
public class Power {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base and exponent of any number");
		int base=sc.nextInt();
		int exponent=sc.nextInt();
		float power;
		System.out.println("power"+base+"^"+exponent);
	}

}
