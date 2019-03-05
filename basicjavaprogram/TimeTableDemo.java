
package basicjavaprogram;
import java.util.Scanner;
public class TimeTableDemo {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        int n,m;
        System.out.print("Enter initaial value: ");
        n= input.nextInt();
        
        System.out.print("Enter final value: ");
        m= input.nextInt();
        
        for (int i = n; i <=m; i++) {
            
            for (int j = 1; j <= 10; j++) {
            System.out.println(i+" X "+j +"="+i*j);
        }
            System.out.println("\n\n");
        }
        
       
    }
    
}
