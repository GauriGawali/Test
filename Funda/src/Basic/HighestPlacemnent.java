package Basic;

import java.util.Scanner;

/*q3)Highest Placement


SRV college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year. 
The departments that have participated in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting maximum placements. 
Check for all the possible output given in the sample snapshot

Note : If any input is negative, the output should be "Input is Invalid".  If all department has equal number of placements, the output should be 
"None of the department has got the highest placement".

Sample Input 1:
Enter the no of students placed in CSE:90
Enter the no of students placed in ECE:45
Enter the no of students placed in MECH:70
Sample Output 1:
Highest placement
CSE*/
public class HighestPlacemnent {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num of student place in CSE department");
	int CSE=sc.nextInt();
	System.out.println("Enter the num of student place in ECE department");
	int ECE=sc.nextInt();
	System.out.println("Enter the num of student place in Mech department");
	int Mech =sc.nextInt();
	if(CSE>ECE && CSE>Mech)
	{
		System.out.println("Highest placemnt in CSE :" +CSE);
	}
	else if(ECE>Mech && ECE>CSE)
		System.out.println("Highest placement in ECE :" +ECE);
	else if(Mech>CSE && Mech>ECE)
		System.out.println("Highest Placement in Mech :" +Mech);
	else if(Mech==0 && CSE==0 && ECE==0)
		System.out.println("None of the department has highest placement");
	else
		System.out.println("invalid input");
	}

}
