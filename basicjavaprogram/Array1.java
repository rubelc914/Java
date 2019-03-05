
package basicjavaprogram;


public class Array1 {
    public static void main(String[] args) {
        int[] number = new int[5];
        int[] number2= new int[10];
        
        number[0]=10;
        number[1]=12;
        number[2]=10;
        number[3]=25;
        number[4]=30;
        
        int sum= number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("sum: "+sum);
        
        int len= number.length;
        System.out.println("Array size: "+len);
        
        System.out.println(number[2]);
        
    }
}
