package Basic;
/*Tom went to a movie with his friends in a multiplex theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 

    Rs.100/pizza
    Rs.20/puffs
    Rs.10/cooldrink

Generate a bill for What Tom has bought.


Sample Input 1:

Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5

Sample Output 1:

Bill Details
No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290
ENJOY THE SHOW!!!*/
import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);


    System.out.println("Enter the no of pizza taken:");

    int pizz=sc.nextInt();

    System.out.println("Enter the no of puffs taken:");

    int puff=sc.nextInt();

    System.out.println("Enter the no of cold drinks taken:");

    int cdrink=sc.nextInt();        

    System.out.println("Bill Details");

    System.out.println("No of pizzas:"+pizz);

    System.out.println("No of puffs:"+puff);

    System.out.println("No of cooldrinks:"+cdrink);

    System.out.println("Total price="+(pizz*100+puff*20+cdrink*10));

    System.out.println("ENJOY THE SHOW!!!");

	}

}
