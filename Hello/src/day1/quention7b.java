package day1;

import java.util.Scanner;

public class quention7b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the value of x and y");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("before the swapping numbers:" +x +" "+ y);
x=x+y;
y=x-y;
x=x-y;
System.out.println(" after swapping numbers:" +x+" "+y);
	}

}
