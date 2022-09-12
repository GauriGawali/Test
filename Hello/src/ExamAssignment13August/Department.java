package ExamAssignment13August;
/*
 1.	WAP to have Department class created with id, name . Student class has roll, name and Department object should have id and name. 
 Assign and print individual values in main method


 */
public class Department {
	int id;
	String name;
	  
	
	Department(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return id+"\nName of Department is:"+name;
	}

}
