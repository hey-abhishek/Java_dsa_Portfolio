package Patterns;

public class Pattern30 {
    public static void main(String[] args) {
        int num = 5;
       // pattern30(num);
       // pattern17(num);
        pattern31(num);

        
        
    }

    // static void pattern30(int num){
    //     for (int row = 0; row <= num; row++) {
    //         for (int col = 0; col < num - row; col++) {
    //             System.out.print("  ");
                
    //         }
    //         for (int col = row; col >= 1 ; col--) {
    //             System.out.print(col+ " ");
                
    //         }
    //         for (int col = 2; col <= row ; col++) {
    //             System.out.print(col + " ");
                
    //         }
    //         System.out.println();
    //     }
        
    // }

    static void pattern17(int num){
        for (int row = 1; row <= 2*num; row++) {

            int c = row > num ? 2 * num - row: row;

            for (int col = 0; col < num - c; col++) {
                System.out.print("  ");
                
            }
            for (int col =c; col >= 1 ; col--) {
                System.out.print(col+ " ");
                
            }
            for (int col = 2; col <= c   ; col++) {
                System.out.print(col + " ");
                
            }
            System.out.println();
        }
        
    }
    static void pattern31(int num){
        int originalN = num;
        num = 2 * num;
        for (int row = 0; row <= num; row++) {
            for (int col = 0; col <= num; col++) {
                int atEverIndex = originalN = Math.min(Math.min(row, col), Math.min(num - row, num-col));
                System.out.print(atEverIndex + " ");
                
            }
            System.out.println();
          
            }
           
        }
        
    }
    

