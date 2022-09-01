package constructor;

import java.util.Scanner;

public class Bike {
	int id,price;
	float disPrice;
	String name,brand,engine,color,paymentType;
	
Bike(int i,int p,String n,String b,String e,String c,String pt)
{
	id=i;
	price=p;
	name=n;
	brand=b;
	engine=e;
	color=c;
	paymentType=pt;
	}

void discount()
{ 
	if(paymentType.equals("Online"))
    { 
		disPrice=price-(price/100*20);
		System.out.println("Disconted price is:"+disPrice);
	}
else if(paymentType.equals("Cash"))
   { 
	disPrice=price-(price/100*25);
	System.out.println("Discounted price is"+disPrice);
   }
}


public String toString()
{   //discount();
	return "\n bike id is:"+id+"\n Bike price is"+price+"\n bike name is"+name+"\n Bike brand is"+brand+"\n Bike engine capacity is: "+engine+"\n bike color is: "+color+"\n Payment mode is"+paymentType;
	}

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter a id");
int id=sc.nextInt();
System.out.println("enter a price");
int price=sc.nextInt();
System.out.println("enter a name");
String name=sc.next();
System.out.println("enter a brand");
String brand=sc.next();
System.out.println("enter a engine capacity");
String engine=sc.next();
System.out.println("enter a color");
String color=sc.next();
System.out.println("enter a Paymenttype Online or Cash");
String paymentType=sc.next();
Bike b=new Bike( id,price,name,brand,engine,color,paymentType);
System.out.println(b);
b.discount();
	}

}
