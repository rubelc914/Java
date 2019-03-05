
package beginnarjava;

import java.util.Scanner;


public class PositiveDemo {
  public static void main(String[] args){
      
   Scanner input= new Scanner(System.in);
   int num;
   System.out.print("Enter the value: ");
   num=input.nextInt();
   
   if(num>0) {
    System.out.println("Positive");
   }
   
   else if(num<0){
    System.out.println("Negative");
   }
   else {
   System.out.println("zero");
   }
  
  
  }
    
}
