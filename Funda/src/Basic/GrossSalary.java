package Basic;

import java.util.Scanner;

/*Write a Java program to input basic salary of an employee and calculate its
Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%,
DA = 90% Basic Salary >20000 : HRA = 30%, DA = 95%
*/
public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /* Scanner sc=new Scanner(System.in);
     
System.out.println("Enter employee basic Salary");
int salary=sc.nextInt();
Hra=sc.nextDouble();
Da=sc.nextDouble();
gross=sc.nextDouble();*/
double Hra,Da,gross,salary=25000;

if(salary<=10000)
{
	Hra=salary*0.2;
	Da=salary*0.8;
	}
else if(salary>10000 && salary<=20000)
{
	Hra=salary*0.25;
	Da=salary*90;
	}
else 
{
	Hra=salary*0.3;
	Da=salary*0.95;
	}
gross=salary+Hra+Da;
 System.out.println("Gross salary of employee is"+gross);
	
	}
}
