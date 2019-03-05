
package beginnarjava;

import java.util.Scanner;

public class TemperatureDemo {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
       double cels, fahrenheit;
       System.out.print("Enter Celsius: ");
       cels=input.nextDouble();
       
       fahrenheit=1.8*cels+32;
       
       System.out.println("Fahrenheit: "+fahrenheit);
    }
    
}
