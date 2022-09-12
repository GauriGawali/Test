package arrayassignments;
//3. WAJP2 test if an array contains a specific value. 
public class Q3 {

      public static boolean contains(int[] a, int num) {
		      for (int n: a) {
		         if (num == n) {
		            return true;
		         }
		      }
		      return false;
		   }
		   public static void main(String[] args) {
		          int[] a = {
		            1789, 2035, 1899, 1456, 2013, 
		            1458, 2458, 1254, 1472, 2365, 
		            1456, 2265, 1457, 2456};
		      System.out.println(contains(a, 2013));
		      System.out.println(contains(a, 2015));
		   }
	}


