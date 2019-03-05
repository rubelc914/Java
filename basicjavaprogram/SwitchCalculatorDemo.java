
package beginnarjava;

import java.util.Scanner;

public class SwitchCalculatorDemo {
    
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);
        
        double first,second;
        char operator;
        System.out.print("Enter Frist Number: ");
        first= input.nextDouble();
        System.out.print("Enter Second Number: ");
        
        second= input.nextDouble();
        System.out.print("Enter any operator(+,-,*,/,%): ");
        operator= input.next().charAt(0);
      double result = 0;
        
        switch(operator){
            
            case '+':
             result = first + second;
                break;

            case '-':
             result = first - second;
                break;
                
            case '*':
             result = first * second;
                break;
                
            case '/':
             result = first / second;
                break;
                
            case '%':
             result = first % second;
                break;
                
            default:
                System.out.println("please input operator");
        }
        System.out.printf("%.1f %c %.1f= %.1f",first,operator,second, result);
    }
    
}
