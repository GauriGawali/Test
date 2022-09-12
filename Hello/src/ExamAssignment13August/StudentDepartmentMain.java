package ExamAssignment13August;

public class StudentDepartmentMain {

	public static void main(String[] args) {
		Department d=new Department(102,"Entc");
		Student s=new Student(52,"Neha",d);
		System.out.println(s);
	}

}
