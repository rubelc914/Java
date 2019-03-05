
package beginnarjava;

import java.util.Scanner;


public class TringleDemo {
  
    public static void main(String[] args){
    
    Scanner input= new Scanner(System.in);
    
    double base, height, area;
    
    System.out.print("base: ");
    base= input.nextDouble();
    
    System.out.print("height: ");
    height= input.nextDouble();
    
    
    area= 0.5*base*height;
    
    System.out.println("Trignle area: "+area);
    
    
    }
    
}
