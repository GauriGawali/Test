package Strings;
/*Write a Java program to trim leading white space characters in a
string.(using string function and without using string function)
 */
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "^\\s+";
		String originalString1 = "   howtodoinjava.com";  //3 leading spaces
		String originalString2 = "   howtodoinjava.com   "; //3 leading and trailing spaces
		 
		String trimmedString1 = originalString1.replaceAll(regex, "");
		String trimmedString2 = originalString2.replaceAll(regex, "");
		 
		System.out.println(trimmedString1);
		System.out.println(trimmedString2);
	}

}
