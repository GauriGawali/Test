package Switcha;

import java.util.Scanner;

//8.write java program for switch expression is of string type
public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Cat");
		System.out.println("Elephant");
		System.out.println("Dog");
		System.out.println("Duck");
		System.out.println("Perrort");
		
		System.out.println("Enter the Animal name:");
		String animal=sc.next();
		
		  
        switch(animal){  
        
        case "Cat":  
            System.out.println("its a Cat sound is Mavu mavu");  
            break;  
            
        case "Elephant":  
            System.out.println("Its a Elephant sound is ooohhh");  
            break;  
        
        case "Dog":  
            System.out.println("Its a Dog sound is bho bho");  
            break;  
            
        case "Duck":  
            System.out.println("Its Duck sound is do do");  
            break;
            
        case "Perrot":  
            System.out.println("Its a Perrot sound is mithu mithu");  
            break;
            
            default:
            	System.out.println("error,Invalid input");
            
            
        }  
	}


	}


