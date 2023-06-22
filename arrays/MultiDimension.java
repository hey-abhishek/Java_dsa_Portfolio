package arrays;
import java.util.*;
public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        // int [][] arr  = new int[3][];
        // int [][] arr2D = {
        //     {1,2,3}, //0th index
        //     {4,5,6}, //1st index
        //     {7,8,9,10} // 2nd index
        // };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no. of rows

        //input

        for (int row = 0; row < arr.length; row++) {
            // for each col in every rows 
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]= in.nextInt();
                
            }
            
        }

        //output
 // for (int row = 0; row < arr.length; row++) {
        //     // for each col in every rows 
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
            
        //   System.out.println();      
        // }       

        // for (int row = 0; row < arr.length; row++) {
        //   System.out.println(Arrays.toString(arr[row]));
        //     }


        // output using Enchanced for loop

        for( int [] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
