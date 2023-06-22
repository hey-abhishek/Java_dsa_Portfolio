package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // arrray of primitives 
        // int [] arr = new int[5];
        // arr[0]= 23;
        // arr[1]= 32;
        // arr[2]=54;
        // arr[3]= 342;
        // arr[4]=534;


         System.out.print("enter the elements:");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
            
        // }

        // first way of printing elements
        // for (int i = 1; i <= arr.length; i++) {
        //     System.out.print(i+" ");
            
        // }

        // Second way of printing elements
        // for (int i : arr) {
        //     System.out.print(i + " ");
            
        // }

        // Another way of printing the elements

       
        //System.out.println(Arrays.toString(arr)); // best way of printing elements.



        //array of objects

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i]= in.next();
            
        }

        str[1] = "panwar";
        System.out.println(Arrays.toString(str));

        
            
        
    }
    
}
