package Basic;
/*Rohan wants a magic board, which displays a character for a corresponding number for his science exhibition. Help him to develop 
such application. For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
[Assume the number of inputs should be always 4 ]*/
import java.util.Scanner;
/* OUTPUT
 * enter the 4 diff input
65
67
68
69

65_A
67_C
68_D
69_E
*/
public class Magicboard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter the 4 diff input");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();

 char v=(char)a;
 char w=(char)b;
 char x=(char)c;
 char y=(char)d;
  System.out.println();
  System.out.print(a);
 System.out.println("_"+v);
 System.out.print(b);
 System.out.println("_"+w);
 System.out.print(c);
 System.out.println("_"+x);
 System.out.print(d);
 System.out.println("_"+y);
	}

}
