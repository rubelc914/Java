
package basicjavaprogram;

import java.util.Scanner;


public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number= new double[5];
        double sum=0;
        System.out.print("Please Enter any 5 number: ");
        for (int i = 0; i < number.length; i++) {
            number[i]= input.nextDouble();
        }
        
        for (int i = 0; i < number.length; i++) {
            sum= sum+ number[i];
        }
        
        double max= number[0];
        double min= number[0];
        
        for (int i = 0; i < number.length; i++) {
            if(max<number[i]){
                max=number[i];
            }
            if(min>number[i]){
                min= number[i];
            }
        }
        
        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);
        
        double avrage= sum / number.length;
        System.out.println("Avrage number: "+avrage);
        System.out.println("sum of the number: "+sum);
        
    }
}
