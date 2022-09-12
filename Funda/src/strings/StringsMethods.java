package strings;

public class StringsMethods {

	public static void main(String[] args) {
		String s1="Java";
		String s2="Language";
		String s3="java";
		String s4="Java";
		String s5=new String("Java");
	//	s1.equalsIgnoreCase(s3);
		System.out.println(s1.concat(s2));
		s1.compareTo(s3);
			System.out.println("compare to ignoreCase:"+s1.compareToIgnoreCase(s3));
			System.out.println("index of"+s2.indexOf('a'));
			System.out.println("last index"+s2.lastIndexOf('a'));
				System.out.println("contains:"+s2.contains("gs"));
				System.out.println("Replace:"+s2.replace('a', 'A')+" "+(s2.replace("age", "AGE")));
				System.out.println("cSearch from index:"+s2.indexOf('a', 3));
				System.out.println("substring:"+s2.substring(1));
				System.out.println("substring for 2 inputs:"+s2.substring(2, 6));
				System.out.println(s2.toUpperCase());
				System.out.println(s2.toLowerCase());
				System.out.println("character:"+s2.charAt(4));
				System.out.println("s2.start with:"+s2.startsWith("a"));
				System.out.println("s2.ends with:"+s2.endsWith("e"));
				System.out.println("length:"+s2.length());
					
	}

}
