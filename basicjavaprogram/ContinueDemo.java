
package basicjavaprogram;


public class ContinueDemo {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++) {
            if (i==10) {
                continue;
            }
            if (i>13) {
                break;
            }
            System.out.println(i);
        }
    }
}
