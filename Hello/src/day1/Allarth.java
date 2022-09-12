package day1;

import java.util.Scanner;

public class Allarth {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//System.out.println("enter the value of x and y");
	//Scanner sc=new Scanner(System.in);
	//int x=sc.nextInt();
	//int y=sc.nextInt();
	/*System.out.println("enter radious of circle");
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
float pi=3.14f;
double Area=pi*r*r;
System.out.println("Area of circle="+ Area);
	*/
/*int sum,sub,mul,div;
/*x=20;
y=10;
sum=x+y;sub=x-y;mul=x*y;div=x/y;
System.out.println("sum ="+ sum +" sub ="+ sub  +  "multiplication =" + mul+  "division=" + div);*/
	/* Scanner sc=new Scanner(System.in);
	 System.out.println("Enter num1 num2,num3");
	 int num1=sc.nextInt();
	 int num2=sc.nextInt();
	int num3;
	 num3=num1;
	 num1=num2;
	 num2=num3;
	 System.out.println("show after swapping"+ num1 + num2 );
	*/
		/*int Days,weeks,year;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Days");
		Days=sc.nextInt();
		year=Days/365;
		weeks=(year*365)/7;
		Days=(Days-(year*365)+(weeks*7));
		System.out.println(" "+year+" "+weeks+" "+Days);
		
		*/
	/*Scanner sc=new Scanner(System.in);
	System.out.println("Enter p t r");
	float p=sc.nextFloat();
	float t=sc.nextFloat();
	float r=sc.nextFloat();
	float si=(p*t*r)/100;
	System.out.println("Simple interest"+si);
	
	*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter math,science,history,english,chemistry marks");
		int math=sc.nextInt();
		int science=sc.nextInt();
		int history=sc.nextInt();
		int english=sc.nextInt();
		int chemistry=sc.nextInt();
		int total=math+science+english+chemistry+history;
		float percentage=total/5;
		System.out.println("total marks="  +total+"and percentage are="+ percentage);
		
	}

}
