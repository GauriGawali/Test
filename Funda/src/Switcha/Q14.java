package Switcha;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i = 1, j = 0;
        switch (i) {
        default :
            j += 2;
            case 2 :
                j += 6;
            case 4 :
                j += 1;
            
            case 0 :
                j += 4;
        }
        System.out.println("j = " + j);
    }

	}


