
package basicjavaprogram;

import java.util.Scanner;


public class ArmstrongDemo {
    public static void main(String[] args) {
        int num,temp,r,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        num = input.nextInt();
        temp= num;
        
        while(temp != 0){
            r = temp % 10;
            sum= sum + r*r*r;
            temp = temp /10;
        }
        if(sum== num){
            System.out.println("It is a Armstrong number!");
        }
        else{
            System.out.println("It is a not Armstrong number ");
        }
        
    }
}
