package day2;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String s1="java String Quiz";
System.out.println(s1.substring(5,3));
//System.out.println(s1.charAt(s1.toUpperCase().length()));
String s3= new String("abc");
s3.intern();
//StringBuffer s2=new StringBuffer(s1);
//System.out.println(s1.compareTo(s3));
System.out.println(s1==s3);
System.out.println(s1==s3.intern());*/

		  try 
          {
              System.out.print("A");
              throw new NullPointerException ("Hello");
          }
          catch(ArithmeticException e) 
          {
      	System.out.print("B");        	
          }
      }
	}


