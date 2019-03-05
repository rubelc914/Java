
package basicjavaprogram;


public class Array3 {
    public static void main(String[] args) {
       int sum=0;
        int[] num={10,20,30,40,50,60,70,80,90,100};
        System.out.println("array lenth: "+ num.length);
        
        for(int number : num){
            sum= sum+number;
                  
        }
         System.out.println("totatl number: " +sum); 
                
                
        
    }
}
