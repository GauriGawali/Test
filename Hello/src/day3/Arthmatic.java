package day3;

public class Arthmatic {

    int add(int num1, int num2)
    {
        return num1+num2;
    }
    int sub(int num1, int num2)
    {
        return num1-num2;
    }
    int mul(int num1, int num2, int num3, int num4)
    {
        return num1*num2*num3*num4;
    }
    float div(int num1,int num2)
    {
    	
    return num1/num2;}
    
    public static void main(String[] args) 
    {    
    	Arthmatic obj = new Arthmatic();
    	//This will call the first add method
        System.out.println("Sum of two numbers: "+obj.add(10, 20));
        //This will call second add method
        System.out.println("sub of three numbers: "+obj.sub(60, 50));
        //This will call third add method
        System.out.println("Mul of four numbers: "+obj.mul(1,  2, 3, 4));
 System.out.println("Div of two numbers:" +obj.div(40, 02));
}
}