package statica;

public class Employee {
int id,salary;
String name;
static String compName="EEPL";
 static {
	 compName="bmpl";
	 System.out.println("static blk 1");
 }
 static {
	 System.out.println("static blk 2");
 }
 
 Employee(int i,int s,String n)
 {
	this. id=i;
	this.salary=s;
	this. name=n;
 }
 
 
 static void compInfo()
 {
	 System.out.println("Its a good company");
 }
  
 public String toString()
 {
	 return id+" "+salary+" "+name;
 }
  
   static void display() {
	  System.out.println(compName);
	  Employee emp=new Employee(1,50000,"Neha");
	  System.out.println(emp.id+" "+emp.salary+" "+emp.name);
	  
  }
	public static void main(String[] args) {
		//System.out.println(Employee.compName);
		
		 Employee e1=new Employee(1,50000,"gauri");
		 /*System.out.println(e1);
        
		 Employee e2=new Employee(2,500500,"gaurav");
		System.out.println(e2);
		 e2.compInfo();*/
		
		 e1.display();
		 
	     compInfo();
	}

}
