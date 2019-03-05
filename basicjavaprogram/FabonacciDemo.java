
package basicjavaprogram;

import java.util.Scanner;
public class FabonacciDemo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("how many numbers: ");
        int n1=0,n2=1,n3,n;  
        n= input.nextInt();
 System.out.print(n1+" "+n2);//printing 0 and 1  
  
 for(int i=3;i<=n;++i)//loop starts from 2 because 0 and 1 are already printed  
 {  
  n3=n1+n2;  
  System.out.print(" "+n3);  
  n1=n2;  
  n2=n3;  
 } 
        
    }
    
}
