package forLoop;
//create a only even No table.
import java.util.Scanner;

public class SumNoTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int no=sc.nextInt();
		int i;
		for(i=1;i<=10;i++)
		{ 
			if(no%2==0)
			System.out.print(i*no+" ");
		}
		System.out.println("invalid input");
	}
}	
		 
			

