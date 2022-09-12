package day3;
/*8. Create one class Employee (id , name, salary) with private access modifier
and create getter and setter. */
public class Employee {

	
	private int id;
	private String name;
	private int salary;
	
	private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getSalary() {
		return salary;
	}

	private void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee E=new Employee();
System.out.println(E.id);
System.out.println(E.name);

	}

}
