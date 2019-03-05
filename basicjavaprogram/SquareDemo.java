
package beginnarjava;

import java.util.Scanner;

public class SquareDemo {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
        double side, area;
        
        System.out.print("Enter side: ");
        side=input.nextDouble();
        area= side*side;
        System.out.println("Square area is: "+area);
    }
 
}
