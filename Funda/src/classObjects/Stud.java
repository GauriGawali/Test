package classObjects;

import java.util.Scanner;

public class Stud {
	int id,m1,m2,m3,m4,m5;
	String name,dept;
	void setData(int i,int phy,int math,int chem,int bio,int eng,String n,String d) {
		id=i;
		m1=phy;
		m2=math;
		m3=chem;
		m4=bio;
		m5=eng;
		name=n;
		dept=d;
		}
	int add()
	{
		int total=m1+m2+m3+m4+m5;
		System.out.println("Total of five subject marks is:"+total);
		return total;
	}
	int per(int total)
	{
		int per=total/5;
		System.out.println("Percentage of student is:"+per+"%");
		return per;
	}
	
void grade(float per)
{
	if(per>75)
	{
		System.out.println(name+" pass in First class");
	}
	else if(per<74 && per>=60)
	{
		System.out.println(name+"Pass with Firstclass");
	}
	else if(per<59 && per>=50)
	{
		System.out.println(name+"Pass with Second class");
	}
	else if(per<49 && per>=35)
	{
		System.out.println(name+"Pass in Third class");
	}
	else
		System.out.println(name+"Fail class");
}
	
	
		 void display()
		 {System.out.println("Id is:"+id);
		 System.out.println("Name is:"+name);
		 System.out.println("Department is:"+dept);
	   //  System.out.println(id+" "+name+" "+dept+" "+m1+" "+m2+" "+m3+" "+m4+" "+m5); 
		 }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Stud S1=new Stud();
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter a name");
		String n=sc.next();
		System.out.println("enter a dept");
		String dept=sc.next();
		System.out.println("Enter a bio, math, chem, phy, eng. marks");
		int bio=sc.nextInt();
		int math=sc.nextInt();
		int chem=sc.nextInt();
		int eng=sc.nextInt();
		int phy=sc.nextInt();
		S1.setData(id, phy, math, chem, bio, eng, n, dept);
		
        
   	 Stud S2=new Stud();
   	 
        System.out.println("enter id");
		 id=sc.nextInt();
		System.out.println("enter a name");
		 n=sc.next();
		System.out.println("enter a dept");
		 dept=sc.next();
		System.out.println("Enter a bio, math, chem, phy, eng. marks");
		 bio=sc.nextInt();
		 math=sc.nextInt();
	      chem=sc.nextInt();
		 eng=sc.nextInt();
		 phy=sc.nextInt();
		 S2.setData(id, phy, math, chem, bio, eng, n, dept);
		
        
        Stud S3=new Stud();
        
        System.out.println("enter id");
		 id=sc.nextInt();
		System.out.println("enter a name");
		 n=sc.next();
		System.out.println("enter a dept");
		 dept=sc.next();
		System.out.println("Enter a bio, math, chem, phy, eng. marks");
		 bio=sc.nextInt();
		 math=sc.nextInt();
	      chem=sc.nextInt();
		 eng=sc.nextInt();
		 phy=sc.nextInt();
		 S3.setData(id, phy, math, chem, bio, eng, n, dept);
		 
	
//_____________________________________________________________________________________|

S1.display();
int total=S1.add();
int per=S1.per(total);
S1.grade(per);
System.out.println("___________________________________________________________________");
//_______________________________________________________________________________________\

S2.display();
total=S2.add();
per=S2.per(total);
S2.grade(per);
System.out.println("___________________________________________________________________");
//_______________________________________________________________________________________\

S3.display();
total=S1.add();
per=S3.per(total);
S3.grade(per);
System.out.println("___________________________________________________________________");

}
}
