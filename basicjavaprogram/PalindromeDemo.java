
package basicjavaprogram;

import java.util.Scanner;


public class PalindromeDemo {
    public static void main(String[] args) {
        
        int num,temp, r, sum=0;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter any number: ");
        num= input.nextInt();
        temp = num;
        
        while(temp !=0){
            r= temp % 10;
            sum= sum*10+r;
            temp= temp / 10;
        }
        if(sum==num){
            System.out.println("Number is palindrome!");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}
