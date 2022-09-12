package ExamAssignment30july;

import java.util.Scanner;

/*1.Create class Box and calculate the volume of box volume=length x width x height 
 * (create separate method for volume).*/
public class Box{
void volume(int length,int width,int height) {
	 int volume=length*width*height;
	 System.out.println("Box volume is:"+volume);
}
	public static void main(String[] args) {
		Box b=new Box();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lenght width and height");
		int length=sc.nextInt();
		int width=sc.nextInt();
		int height=sc.nextInt();
		b.volume(length, width, height);
		
	}

}
