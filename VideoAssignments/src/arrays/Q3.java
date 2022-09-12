package arrays;

import java.util.Scanner;

/*
 Take 10 integer inputs from user and store them in an array. Again ask user
to give a number. Now, tell user whether that number is present in array or
not
 */
public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  int[] a = new int[10];             //install the array

          boolean present = false;                // putting flag condition

          for (int i = 0; i < a.length; i++) {            // taking values

              System.out.println("enter number \r");

              a[i] = sc.nextInt();

          }

          System.out.println("enter number to check ");

          int number = sc.nextInt();             // taking values of checking

          for (int j:a) {

              if (j == number)

                  present = true;

          }

          System.out.println(present);     // Output the value is True or False

      }


    }
	


