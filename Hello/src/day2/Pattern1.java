package day2;
/*
* * * * *
* * * *
* * *
* * 
* 
 */
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=5;i>0;i--) {
	for(int j=i;j>=1;j--) {
		System.out.print("*"+" ");
	}
	System.out.println("");
}
	

/*
 * * * * *
  * * * *
   * * *
    * *
     * 
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

 
	*/
int rows=5;  
for (int i= 0; i<= rows-1; i++)  
{  
for (int j=0; j<=i; j++)  
{  
System.out.print(" ");  
}  
for (int k=0; k<=rows-1-i; k++)  
{  
System.out.print("*" + " ");  
}  
System.out.println();  
}  
}  }