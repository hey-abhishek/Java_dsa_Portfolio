package Patterns;

public class pattern2 {
    

    public static void main(String[] args) {
        int num = 5;
        pattern2(num);
        
    }
    static void pattern2(int num){
        for (int row = 1; row <= num; row++) {
            // for every row, run the col
            for (int col = 1; col <= num; col++) {
                System.out.print("* ");
                
            }
            // when one row is printed, we need  to add  a newline
            System.out.println();
            
        }
    }
    
}
