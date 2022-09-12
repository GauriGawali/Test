package Strings;
//1.Write a Java program to find reverse of a string(using function).
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str= "Geeks", nstr="";
	        char ch;
	        
	      System.out.print("Original word: ");
	      System.out.println("Geeks of word"); //Example word
	        
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }
	/*
	  String input = "Geeks for Geeks";
  
        StringBuilder input1 = new StringBuilder();
  
        // append a string into StringBuilder input1
        input1.append(input);
  
        // reverse StringBuilder input1
        input1.reverse();
  
        // print reversed String
        System.out.println(input1);
    }
	 */
	/*
	 {
        String input = "Geeks For Geeks";
        char[] hello = input.toCharArray();
        List<Character> trial1 = new ArrayList<>();
  
        for (char c : hello)
            trial1.add(c);
  
        Collections.reverse(trial1);
        ListIterator li = trial1.listIterator();
        while (li.hasNext())
            System.out.print(li.next());
    }
	 */
	}


