package constructor;

import java.util.Scanner;

public class Person {
int id,age;
String name,address,email;
long contact;

public Person(int i,String n,int a,String ad,String em,long co)
{
	id=i;
	name=n;
	age=a;
	address=ad;
	email=em;
	contact=co;
	}
   public String toString()
{
	return id+"\n"+name+"\n"+age+"\n "+address+"\n "+email+"\n "+contact;
	}

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter a id");
int id=sc.nextInt();
System.out.println("Enter name");
String name=sc.next();
System.out.println("Enter age");
int age=sc.nextInt();
System.out.println("Enter address");
String address=sc.next();
System.out.println("Enter Email id");
String email=sc.next();
System.out.println("Enter a contact number");
long contact=sc.nextLong();
Person P1=new Person(id,name,age,address,email,contact);
//System.out.println(P1);



System.out.println("Enter a id");
id=sc.nextInt();
System.out.println("Enter name");
 name=sc.next();
System.out.println("Enter age");
 age=sc.nextInt();
System.out.println("Enter address");
 address=sc.next();
System.out.println("Enter Email id");
email=sc.next();
System.out.println("Enter a contact number");
 contact=sc.nextLong();
Person P2=new Person(id,name,age,address,email,contact);




System.out.println("Enter a id");
id=sc.nextInt();
System.out.println("Enter name");
 name=sc.next();
System.out.println("Enter age");
 age=sc.nextInt();
System.out.println("Enter address");
 address=sc.next();
System.out.println("Enter Email id");
email=sc.next();
System.out.println("Enter a contact number");
 contact=sc.nextLong();
Person p3=new Person(id,name,age,address,email,contact);


System.out.println(P1);
System.out.println(P2);
System.out.println(p3);
	}

}
