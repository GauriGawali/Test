package constructor;

import java.util.Scanner;

public class Car {
	int id,price;
	String name,company;
	Car(){
		name="asd";
		company="xyz";
		id=0;
		price=000;
		
	}
	Car(int i,String n,String c,int p)
	{
		id=i;
		name=n;
		company=c;
		price=p;
	}
	
	public String toString()
	{
		return id+" "+name+" "+company+" "+price;
	}
	void display()
	{
		System.out.println("Car id is:"+id);
		System.out.println("Car NAME IS:"+name);
		System.out.println("PRICE  Is"+price);
		System.out.println("Company name is:"+company);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a id");
		int id=sc.nextInt();
		System.out.println("Enter a price");
		int price=sc.nextInt();
		System.out.println("Enter a name");
		String name=sc.next();
		System.out.println("Enter a company");
		String company=sc.next();
		Car c1=new Car(id,name,company,price);
		System.out.println(c1);
		//c1.display();

	}

}
