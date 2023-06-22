package Patterns;

public class pattern5 {
    public static void main(String[] args) {
        int num = 5;
        pattern5(num);
        
    }
    static void pattern5(int N){
        for (int row = 0; row < 2 * N -1 ; row++) {
            // for every row, run the col
            int totalColsInRow = row > N ? 2*N - row:row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
                
            }
            // when one row is printed, we need  to add  a newline
            System.out.println();
            
        }
    }
}
