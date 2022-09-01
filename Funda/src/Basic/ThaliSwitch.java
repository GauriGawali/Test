package Basic;
/* OUTPUT
1.Maharastrian Thali
2.Gujrati Thali
3.Bengoli Thali
4.Kashmiri Thali
5.Kerala Thali
Enter your choice
1
Enter a Quantity and Rate
2
150
total bill is:300
*/
import java.util.Scanner;

public class ThaliSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Maharastrian Thali");
		System.out.println("2.Gujrati Thali");
		System.out.println("3.Bengoli Thali");
		System.out.println("4.Kashmiri Thali");
		System.out.println("5.Kerala Thali");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter a Quantity and Rate");
			int q=sc.nextInt();
			int r=sc.nextInt();
			int total=q*r;
			System.out.println("total bill is:" +total) ;
			break;
		case 2:
			System.out.println("Enter a Quantity and Rate");
			 q=sc.nextInt();
			 r=sc.nextInt();
			 total=q*r;
			System.out.println("total bill is:" +total) ;
			break;
		case 3:
			System.out.println("Enter a Quantity and Rate");
			 q=sc.nextInt();
			 r=sc.nextInt();
			 total=q*r;
			System.out.println("total bill is:" +total) ;
			break;
		case 4:
			System.out.println("Enter a Quantity and Rate");
			 q=sc.nextInt();
			 r=sc.nextInt();
			 total=q*r;
			System.out.println("total bill is:" +total) ;
			break;
			default :
				System.out.println("invalid choice");
		}
		

	}

}
