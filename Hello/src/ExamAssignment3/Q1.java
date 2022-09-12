package ExamAssignment3;
import java.util.Scanner;
public class Q1 {
        String name;
		int id,salary;
		 Q1()                     //default constructor              
		{
				name="Gauri";
				id= 111;
				salary=55000;
		}

		Q1(String name,int id,int salary)           //parameterised constructor
		{
				this.name=name;
				this.id= id;
				this.salary=salary;
		}
				
		public String  toString() {
			return name+"\n"+id+"\n"+salary;
		}
			public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
		       Q1 e1=new Q1();
		  
		     System.out.println("For Parametarised Constructor");
		     System.out.println("Enter Employee name : ");  
		     String name =s.next();
		     System.out.println("Enter Employee id : ");  
		     int id  =s.nextInt();
		     System.out.println("Enter Salary : ");  
		     int salary  =s.nextInt();
		     System.out.println(e1);
		     
		 Q1 e2=new Q1 (name, id, salary);
		     System.out.println("Default Constructor");
		     System.out.println(e2);
		     
		     System.out.println("_______________________________");
		     System.out.println("Parametarised Constructor");
		     
		  
			}

		}


