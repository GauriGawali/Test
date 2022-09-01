package inheritanceConstructor;

public class DepartmentStudentMain  {

	public static void main(String[] args) {
		Student s=new Student(1,"Neha",87);
		Student s1=new Student(2,"Naina",89);
		Student s2=new Student(3,"Nisha",78);
		Student s3=new Student(4,"Nutan",96);
		Student s4=new Student(5,"Namita",82);
		
		
		
		Department d=new Department(1,"sci","DivekarSir",120,s);
		
		System.out.println(d);
		System.out.println("_______________________________________");
	
		Department d1=new Department(2,"computer","ShirkeSir",60,s1);
		
		System.out.println(d1);
		System.out.println("_______________________________________");
		
		Department d2=new Department(3,"Entc","AnandSir",120,s2);
		
		System.out.println(d2);
		System.out.println("_______________________________________");
		
		Department d3=new Department(4,"EEl","MohiteSir",70,s3);
		
		System.out.println(d3);
		System.out.println("_______________________________________");
		
		Department d4=new Department(5,"Printing","nikitamam",150,s4);
		
		System.out.println(d4);
		System.out.println("_______________________________________");
		
	}
	

}
