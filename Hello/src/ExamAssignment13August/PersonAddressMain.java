package ExamAssignment13August;

public class PersonAddressMain {

	public static void main(String[] args) {
		/*Address a=new Address("daund","maharashtra","India");
		
		
		Person p=new Person("Rahul","male",28,a);
		System.out.println(p);*/
		
		
		Address a=new Address();
		a.setCity("Daund");
		a.setState("Maharashtra");
		a.setCountry("India");

		
		
		Person p=new Person();
		p.setName("Gauri");
		p.setGender("Female");
		p.setAge(27);
		p.setA(a);
		
		
		System.out.println(p.getName());
		System.out.println(p.getGender());
		System.out.println(p.getAge());
		System.out.println(p.a.getCity());
		System.out.println(p.a.getCountry());
		System.out.println(p.a.getState());
	}

}
