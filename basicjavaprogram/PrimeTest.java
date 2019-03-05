
package basicjavaprogram;

import java.util.Scanner;

public class PrimeTest {
    public static void main(String[] args) {
        
        int m,n, count=0, totalPrime=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter initail number: ");
        m= input.nextInt();
        System.out.print("Enter Ending number: ");
        n= input.nextInt();
        
        for (int i = m; i <=n; i++) {
            
            for (int j = 2; j <=i-1; j++) {
                if(i%j==0){
                    count++;
                    break;
                }
            }
             if(count==0){
                System.out.println("Prime number: "+i);
                totalPrime++;
            }
            count=0;
           
        }
        System.out.println("Total Prime number= "+totalPrime);
        
       
    }
}
