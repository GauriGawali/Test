
public class Employee {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
int id;
String name;
int salary;
Employee()
{
	id=10;
	salary=10000;
	name="gauri";
	}
	Employee(int i,int ab,String n)
	{
		id=i;
		salary=ab;
		name=n;
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		this.id = id;
	}
	public String getName() {
	return name;	
	}
	public void setName(String name) {
		this.name=name;}
		public int getSalary(int salary) {
			return salary;
		}
		public void  setSalary() {
			this.salary=salary;
		}
	

	private static void Employee() {
		// TODO Auto-generated method stub
		Employee e=new Employee();
	e.setId(10);
	e.setName("gauri");	
	e.setSalary();
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.getSalary(0));
	
	}

}
