package arrayassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
      void display(int my[]){
	
	System.out.println("Present Array : "+Arrays.toString(my));     
}

      void nweCopy(int my[],int copy[]) {
	for(int i=0; i < my.length; i++) {
		 copy [i] = my [i];
		}
		System.out.println("New Array: "+Arrays.toString(my));
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
		int my[]=new int[size];
		System.out.println("Length of array:"+my.length);
		for(int i=0;i<my.length;i++) {
			my[i]=sc.nextInt();
		}
		
		int[] copy = new int[my.length];     
Q5 c=new Q5();
c.display(my);
c.nweCopy(my, copy);
	}

}



