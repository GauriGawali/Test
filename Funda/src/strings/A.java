package strings;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="abc";
String s2=new String("abcd");
//String s2="def";
//System.out.println(s.compareTo(s2));
	System.out.println("s==s2 is:"+s == s2);
	System.out.println(s==s2.intern());
	
	String s5 = "Java String Quiz";
	System.out.println(s.charAt(s5.toUpperCase().length()));
	}

}
