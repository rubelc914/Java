
package basicjavaprogram;

import java.util.Scanner;
public class PimeDemo {
    public static void main(String[] args) {
      
        Scanner input= new Scanner(System.in);
        System.out.print("Enter any Integer number: ");
        int num=input.nextInt();//5
          int count=0;
        for (int i = 2; i <num; i++) {
            
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not prime number");
        }
    }
    
}
