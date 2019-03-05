
package basicjavaprogram;

public class MathDemo {
    public static void main(String[] args) {
        int x=5;
        int y=6;
        
        int max= Math.max(x, y);
        System.out.println("max value: "+max);
        
        int min= Math.min(x, y);
        System.out.println("min  value : "+min);
        
        double power= Math.pow(x, y);
        System.out.println("y is the power of x: "+power);
        
        int round= Math.round(8.2f);
        System.out.println("round value is: "+round);
        
        
    }
}
