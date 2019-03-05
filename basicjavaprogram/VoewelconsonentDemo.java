
package beginnarjava;

import java.util.Scanner;

public class VoewelconsonentDemo {
    
    public static void main(String[] args){
    
        Scanner input= new Scanner(System.in);
        char ch;
        
        System.out.print("Enter any latter: ");
        ch= input.next().charAt(0);
        
        if(ch=='a'||ch=='A'){
        System.out.println("latter is Vowel");
        }
        
        else if(ch=='e'|| ch=='E'){
            System.out.println("latter is Vowel");
        }
        
        else if(ch=='i'|| ch=='I'){
            System.out.println("latter is Vowel");
        }
        
        else if(ch=='o'|| ch=='O'){
            System.out.println("latter is Vowel");
        }
        
        else if(ch=='u'|| ch=='U'){
            System.out.println("latter is Vowel");
        }
        else{
         System.out.println("latter is Consonent");
        }
    }
}
