package ExamAssignment3;
import java.util.Scanner;

public class Student {
	                 int id;
			         String name;
			         String dept;
			         
	Student(String name,int id,String dept)
	                  {
				    
				    this.name = name;
				    this.id = id;
					this.dept = dept;
					    }
	
				     
   Student(Student obj){
		        	  this.name = obj.name;
			          this.id = obj.id;
			          this.dept = obj.dept;
			     }
	public String toString() {
		return name+"\n"+id+"\n"+dept;
	}
	public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter name:");
					String name = sc.next();
					System.out.print("Enter Student Id:");
					int id = sc.nextInt();
					System.out.println("Enter Department:");
					String dept = sc.next();
					
					Student obj1 = new Student(name,id,dept);
					System.out.println("*** Student First ***");
					System.out.println(obj1);
				
					
					Student obj2=obj1;
					System.out.println();
					System.out.println("***Student Second***");
					System.out.println(obj2);
				
					
				}


		

	}


