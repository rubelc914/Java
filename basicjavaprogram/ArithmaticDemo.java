
package beginnarjava;

import java.util.Scanner;

public class ArithmaticDemo {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        double num1,num2,result;
        
        System.out.print("Enter first number: ");
        num1= input.nextDouble();
        
        System.out.print("Enter your Second number: ");
        num2= input.nextDouble();
        
        result= num1+num2;
        System.out.println("Addition: "+result);
        result= num1-num2;
        System.out.println("Substraction: "+result);
        result= num1*num2;
        System.out.println("Multiplication: "+result);
        result= num1/num2;
        System.out.println("Division: "+result);
        result= num1%num2;
        System.out.println("Remainder: "+result);
                
                
                
                
                
        
       
        
       
    }
    
}
