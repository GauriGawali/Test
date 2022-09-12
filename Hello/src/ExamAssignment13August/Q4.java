package ExamAssignment13August;

public class Q4 {
	
	double series(double num) {
        double sum = 0;
        for (int i = 1; i <= num; i++) {
            double term = 1.0 / i;
            sum =sum+ term;
        }
        return sum;
    }
    
    double series(double a, double b) {
        double sum = 0;
        int x = 1;
        for (int i = 1; i <= b; i++) {
            int e = x + 1;
            double term = x / Math.pow(a, e);
            sum =sum+ term;
            x =x+ 3;
        }
        return sum;
    }
    
    public static void main(String args[]) {
        Q4 obj = new Q4();
        System.out.println("First series sum = " + obj.series(15));
        System.out.println("Second series sum = " + obj.series(30, 11));
    }
}


