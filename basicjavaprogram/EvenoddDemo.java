
package beginnarjava;

import java.util.Scanner;
public class EvenoddDemo {
    
    public static void main(String[] args){
    
    Scanner input= new Scanner(System.in);
    
    int num;
    System.out.print("Enter integer number: ");
    num= input.nextInt();
    
    if(num%2==0){
       System.out.println("Number is Even");
    }
    
    else{
    
    System.out.println("Number is Odd");
    }
    
    
    
    
    }
    
}
