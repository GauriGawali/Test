package strings;

public class QINT {
	static void calSum(String s)
    {
       char ch []= s.toCharArray();
         int sum=0 ;
 
       
        for (int i = 0; i < ch.length; i++) {
            
 
             if (ch[i]> '0' && ch[i]<'9') {
            sum=sum+ch[i]-48;	 
             }
            
             }
        System.out.println(sum);
    }
 
            
	public static void main(String[] args) {
		 String s = "1x2abc20yz6v8";
		 QINT.calSum(s);
	}

}
