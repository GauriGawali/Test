package day2;
//Find all prime number between 1 to 50.
public class quen9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 1; i <= 50; i++) {
	            int c = 0;
	            for (int j = 1; j <= i; j++) {
	                if (i % j == 0)
	                    c++;
	            }
	            if (c == 2)
	                System.out.println(i);
	        }
	}  

}
