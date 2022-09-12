package pattern;
/*i=5;i>=1;i--

k=1;k<=5-i;k++

j=1;j<=i;j++

and Your Sop("* ")
 1)
 *****
  ****
   ***
    **
     *

 */
public class RevStar {

	public static void main(String[] args) {
		int n=5;  
		//inner loop  
		for (int i= n; i>= 1; i--)  
		{  
		//outer loop  
		for (int j=1; j<=n-i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (int k=1;k<=i;k++)  
		{  
		System.out.print("*");  
		}   
		System.out.println("");  
		}  
		}  
		
	}


    
  