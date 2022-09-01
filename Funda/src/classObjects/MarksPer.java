package classObjects;

import java.util.Scanner;

public class MarksPer {
	
	
	int add(int m1,int m2,int m3,int m4,int m5)
	{
		int total=m1+m2+m3+m4+m5;
		return total;
	}
	int per(int total)
	{
		int per=total/5;
		return per;
	}
	void grade(int total)
	{
		if(per(total)>75)
		{
			System.out.println("Pass with distiction");
		}
		else if(per(total)<74 && per(total)>=60)
		{
			System.out.println("Pass with Firstclass");
		}
		else if(per(total)<59 && per(total)>=50)
		{
			System.out.println("Pass with Second class");
		}
		else if(per(total)<49 && per(total)>=35)
		{
			System.out.println("Pass in Third class");
		}
		else
			System.out.println("Fail class");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MarksPer m=new MarksPer();
		System.out.println("Enter m1,m2,m3,m4,m5 sub marks");
		 int m1=sc.nextInt();
		 int m2=sc.nextInt();
		 int m3=sc.nextInt();
		 int m4=sc.nextInt();
		 int m5=sc.nextInt();
		 int total=m.add(m1, m2, m3, m4, m5);		 
		 //int per=m.per(total);
		
		 System.out.println("Marks total is:"+total);
		 m.grade(total);
	}

}
