package arrayassignments;

import java.util.Scanner;

/*
 4. WAJP2 find the index of an array element value. 
 */
public class Q4 {
    public static int fIndex(int a[], int size)
    {
        if (a == null) //if array null
        {
            return -1;
        }
  
        int len = a.length;  // find length of array
        int i = 0;
        while (i < len) {
  
            if (a[i] == size) {
                return i;
            }
            else
            {
                i = i + 1;
            }
        }
        return -1;
    }
  
   
    public static void main(String[] args)
    {
    	 Scanner sc=new Scanner(System.in);
 		System.out.println("Enter size of Array");
 		int size=sc.nextInt();
 		int a[]=new int[size];
 		System.out.println("Length of array:"+a.length);
 		for(int i=0;i<a.length;i++) {
 			a[i]=sc.nextInt();
 		}
     
        Q4 f=new Q4();
       f.fIndex(a, size);
        System.out.println("Index position of 9 is:"+ fIndex(a, 9));       // find the index of 5
  
      
        System.out.println("Index position of 71is:"+ fIndex(a, 71));         // find the index of 7
	}

}
