package Strings;

import java.util.Scanner;

/*Create a User {String username, String password} Ask user to enter username and password. Find out username and password entered by user
is valid or not. Do some validations for password entered by user as follows and display appropriate message to user. Validation Message as follows -
a. If password length is less than 8 - password must be 8 chars
long.
b. If password does not contain # or @ - at least one special @ or
# character must be present.
c. If password does not contain number 0 – 9 - password must
contain at least one digit.
d. If password contains space - password must not have space.
e. If password does not contain uppercase char - password must
have at least one uppercase letter.
f. If user enters password tQ123 - message will be password
must be 8 chars long. At least one special @ or # character
must be present.

 */
public class Q21 {
	public static final int PASSWORD_LENGTH = 8;

	public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        System.out.print(
	                "1. A password must have at least eight characters.\n" +
	                "2. A password consists of only letters and digits.\n" +
	                "3. A password must contain at least two digits \n" +
	                "Input a password (You are agreeing to the above Terms and Conditions.): ");
	        String s = input.nextLine();

	        if (is_Valid_Password(s)) {
	            System.out.println("Password is valid: " + s);
	        } else {
	            System.out.println("Not a valid password: " + s);
	        }

	    }

	    public static boolean is_Valid_Password(String password) {

	        if (password.length() < PASSWORD_LENGTH) return false;

	        int charCount = 0;
	        int numCount = 0;
	        for (int i = 0; i < password.length(); i++) {

	            char ch = password.charAt(i);

	            if (is_Numeric(ch)) numCount++;
	            else if (is_Letter(ch)) charCount++;
	            else return false;
	        }


	        return (charCount >= 2 && numCount >= 2);
	    }

	    public static boolean is_Letter(char ch) {
	        ch = Character.toUpperCase(ch);
	        return (ch >= 'A' && ch <= 'Z');
	    }


	    public static boolean is_Numeric(char ch) {

	        return (ch >= '0' && ch <= '9');
	    



}
	    
	    
	    
	    ]

	

}
\41 mnbvcxz\
