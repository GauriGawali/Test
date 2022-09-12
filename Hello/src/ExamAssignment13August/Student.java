package ExamAssignment13August;

public class Student {
	
	int roll;
	String name;
	Department d;
	 Student(int roll,String name,Department d){
		 this.roll=roll;
		 this.name=name;
		 this.d=d;
	 }
	 public String toString() {
		 return "Student roll no is:"+roll+"\nName of Student is:"+name+"\nDepartment Details:"+d;
	 }

}
