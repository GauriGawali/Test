package strings;

public class StringBuffers {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello ");
		sb.append("Java");//now original string is changed.
		System.out.println(sb);//prints Hello Java.
		
		System.out.println(sb.capacity());
System.out.println(sb.length());
System.out.println(sb.reverse());
System.out.println(sb.replace(2, 5, "XYZ"));
sb.deleteCharAt(1);
System.out.println(sb);
sb.delete(2, 5);
System.out.println(sb);
	}

}
