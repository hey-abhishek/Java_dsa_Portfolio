package Patterns;

public class pattern3 {
 
    public static void main(String[] args) {
        int num = 5;
        //pattern3(num);
        pattern4(num);
        
    }
    static void pattern3(int num){
        for (int row = 1; row <= num; row++) {
            // for every row, run the col
            for (int col = 1; col <= num - row; col++) {
                System.out.print("* ");
                
            }
            // when one row is printed, we need  to add  a newline
            System.out.println();
            
        }
    }
    static void pattern4(int num){
        for (int row = 1; row <= num; row++) {
            // for every row, run the col
            for (int col = 1; col <=  row; col++) {
                System.out.print(col + " " );
                
            }
            // when one row is printed, we need  to add  a newline
            System.out.println();
            
        }
    
    }
}
