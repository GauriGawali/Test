package arrayassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
	 void display(int ori[]){
			
			System.out.println("Original Array : "+Arrays.toString(ori));     
		}
	
 void rev(int ori[],int re[]) {
System.out.println("Array in reverse order: ");  

for (int i=re.length-1; i >= 0; i--) {   
    System.out.print(re[i] + " ");   
}    
}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	 		System.out.println("Enter size of Array");
	 		int size=sc.nextInt();
	 		int ori[]=new int[size];
	 		System.out.println("Length of array:"+ori.length);
	 		for(int i=0;i<ori.length;i++) {
	 			ori[i]=sc.nextInt();
	 		}
	     
		  
	        Q6 r=new Q6();
	        r.display(ori);
	        r.rev(ori, ori);
	        
	       
	          
	       
	}

}
