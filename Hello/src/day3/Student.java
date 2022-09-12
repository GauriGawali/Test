package day3;
//. 1.create class Student and create 2 objects of Student using new keyword
/*2.Now id, name in student class. assign value to id, name there Itself and in
main method print values then change value of instance variables and again
print the values (Observe you cannot access id directly without creating
object)
3. Create getId() method in Student class. call getId() method from
displayData method so that you know that one method can be called from
another method. Return id from getId() method and set that id to the
instance variable in displayData method.
4. Add display method inside Student class change values of id, name in that
method & also print the changed values in same method. Call display
method from main method. */
public class Student {
int rollNo;
String stnd;
String sName;
Float marks;
void getId()
{
	}
void acceptDetails(int r,float m,String sd,String n)
{

		rollNo=r;
		marks=m;
		stnd= sd;
		sName= n;
		
		}
	void showDetails()
	{
		
		System.out.println("student roll no:" +rollNo);
		System.out.println("Student standard: " +stnd);
		System.out.println("Student marks: " +sName);
		System.out.println("Student marks:   " +marks);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
Student s1=new Student();

s.acceptDetails(12, 89.98f, "ten","adu");
s1.acceptDetails(1, 90.0f, "first", "gauri");
System.out.println();
s.showDetails();
s1.showDetails();
	}

}
