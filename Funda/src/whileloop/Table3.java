package whileloop;
//Create a table by using while loop.
import java.util.Scanner;

public class Table3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter table no");
		int no=sc.nextInt();
		int m=1;
		while(m<=10)
		{
			System.out.println(m*no);
			m++;
		}
		
//System.out.println(no);
	}

}
