package classObjects;

import java.util.Scanner;

public class Bonus {
int id,salary;
String name,dept,rating;
void setData(int i,int s,String n,String d,String R)
{
	id=i;
	salary=s;
	name=n;
	dept=d;
	rating=R;
	}

void display()
{//
	System.out.println("Employee id:"+id);
	System.out.println("Employee Name:"+name);
	System.out.println("Employee working Departamnet:"+dept);
	System.out.println("Employee rating is:"+rating);
	System.out.println("Employee Regular Salary:"+salary);
}
	void bonus() {
		float Bonussalary;
	if(rating.equals("A"))
	{  
	Bonussalary=salary+(salary/100*20);
	System.out.println("Bonus Salary :"+Bonussalary);
		}
	else if(rating.equals("B"))
	{   Bonussalary=salary+(salary/100*15);
		System.out.println("bonus Salary:"+Bonussalary);
	}
	else if(rating.equals("C"))
	{
		Bonussalary=salary+(salary/100*10);
		System.out.println("bonus Salary:"+Bonussalary);
		
	}
	else if(rating.equals("D"))
	{
		Bonussalary=salary+(salary/100*5);
		System.out.println("bonus Salary:"+Bonussalary);
	}
	}
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=Sc.nextInt();
		System.out.println("Enter a name");
		String name=Sc.next();
		System.out.println("Enter a Department");
		String dept=Sc.next();
		System.out.println("Enter a Rating");
		String Rating=Sc.next();
		System.out.println("Enter salary");
		int Sal=Sc.nextInt();
		Bonus b=new Bonus();
		b.setData(id, Sal, name, dept, Rating);
		b.display();
        b.bonus();
	}

}
