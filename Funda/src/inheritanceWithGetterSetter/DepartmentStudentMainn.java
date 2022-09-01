package inheritanceWithGetterSetter;

public class DepartmentStudentMainn {

	public static void main(String[] args) {
		Student s=new Student();
		s.setId(1);
		s.setName("pooja");
		s.setMarks(90);
		/*
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getMarks());
		*/

		
		
		
		
		Department d=new Department();
		d.setId(1);
		d.setName("puja");
		d.setNoStud(120);
		d.setHod("Puja mam");
		d.setS(s);
		
		System.out.println(d.getName());
		System.out.println(d.getNoStud());
		System.out.println(d.getHod());
		System.out.println(d.s.getName());
		System.out.println(d.s.getMarks());

	}

}