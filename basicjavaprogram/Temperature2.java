
package beginnarjava;

import java.util.Scanner;
public class Temperature2 {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        double fahren, cels;
        System.out.print("Enter your Fahrenheit: ");
        fahren= input.nextDouble();
         cels= 0.5555*(fahren-32);
         
         System.out.println("Celsius: "+cels);
         
        
        
    }
}
