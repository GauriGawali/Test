package day4;
//1. Create a class Account with member Variable: long accountNo, String customerName,
/*2. In main, create a new object of the Account class and print the instance
variables value.
(Note – Default constructor is provided by Java to facilitate the creation of a
new object, here variables are assigned default values)*/
/*3. Create default constructor assign new value to all variables and write “ I
am in default Constructor”
4. In main, create another object of the Account class and print the member
variables value.
(Note – Since you have defined a (default) constructor, Java does not
provide another one)
 }*/
public class Account {
	
	long accountNo;
	String customerName;
 
  public Account(){
	accountNo=102124l;
 customerName="hgfd";
 }
  public void show() {
	  System.out.println("Im default constructor");
	  System.out.println(accountNo);
System.out.println(customerName);
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Account a=new Account();
	//System.out.println(" "+accountNo+ " ""+customerName");
	a.show();

	}
}
