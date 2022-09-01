package Basic;

import java.util.Scanner;

//distance=speed*time
public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Speed");
		int speed=sc.nextInt();
		System.out.println("Enter the time Required");
		int time=sc.nextInt();
	
        int distance=speed*time;
        System.out.println("Distance travel is:"+distance+"km");
	}

}
