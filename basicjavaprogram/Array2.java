
package basicjavaprogram;

import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double sum=0;
        double[]number= new double[10];
        System.out.print("Enter any 10 numbers: ");
        for (int i = 0; i <number.length; i++) {
            number[i]= input.nextDouble();
        }
        
        for (int i = 0; i <number.length; i++) {
            sum= sum+ number[i];
        }
        System.out.println("sum of total array nubmer: "+sum);
        
        double avrage= sum/number.length;
        System.out.println("array avrage: "+avrage);
    }
    
}
