
package beginnarjava;

import java.util.Scanner;

public class LeapYearDemo {
    
    public static void main(String[] args){
        
       int year;
       Scanner input= new Scanner(System.in);
        System.out.print("Enter any year: ");
        
       year= input.nextInt();
       
      
       
       if((year%400==0) || ((year%4==0) && (year%100!=0) )){
           
           System.out.println("Leap year");
       }
       
       else{
           System.out.println("Not Leap year");
       }
    }
}
