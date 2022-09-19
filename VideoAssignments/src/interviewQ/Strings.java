package interviewQ;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		String s="programming";
		char ch[]=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<ch.length;i++) {
			int c=0;
			 for (int j = 0; j < ch.length; j++)
		        {
		            // checking if two characters are equal
		            if (ch[i] == ch[j])
		            {
		                c++ ;
		               
		            }
		            }
			 
			if(c==1) {
				System.out.println(ch[i]);
			}
		}

	}

		}
	

		/* String str = "proramming";
		 
		    for (int i = 0; i < str.length(); i++)
		    {
		        int flag = 0;
		        for (int j = 0; j < str.length(); j++)
		        {
		            // checking if two characters are equal
		            if (str.charAt(i) == str.charAt(j) && i != j)
		            {
		                flag = 1;
		                break;
		            }
		        }
		        if (flag == 0)
		            System.out.print(str.charAt(i));
		    }
		}
		
		
	
}*/
