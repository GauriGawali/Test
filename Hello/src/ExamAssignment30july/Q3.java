package ExamAssignment30july;

import java.util.Scanner;

/*3.	National game of India is Hockey, China is Table Tennis, Bangladesh is Kabaddi, Italy is Football,
United States is baseball. Write a Java program to read country name as user-input and to print the
country’s national game. Use switch.


*/
public class Q3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("1.India");
	System.out.println("2.China");
	System.out.println("3.Bangladesh");
	System.out.println("4.Italy");
	System.out.println("5.United States");
	System.out.println("Enter your choice");
	String ch=sc.next();
	switch(ch)
	{
	case "India":
		System.out.println("National game of India is Hockey");
		break;
	case "China":
		System.out.println("National game of China is Table Tennis");
		break;
	case "Bangladesh":
		System.out.println("National game of  Bangladesh is Kabaddi");
		break;
	case "Italy":
		System.out.println("National game of Italy is Football");
		break;
	case "United States":
		System.out.println("National game of United States is baseball");
		break;
	default:
			System.out.println("Enter Invalid Input");
	}

}
}