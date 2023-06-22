package Patterns;

import java.util.concurrent.ForkJoinPool;

public class pattern1 {
    public static void main(String[] args) {
        int num = 5;
        pattern1(num);
        
    }
    static void pattern1(int num){
        for (int row = 1; row <= num; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
                
            }
            // when one row is printed, we need  to add  a newline
            System.out.println();
            
        }
    }
    
}
