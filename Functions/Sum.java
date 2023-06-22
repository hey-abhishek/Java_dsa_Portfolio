package Functions;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Sum {
    public static void main(String[] args) {
       
        sum();    
    }

    static void sum(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the num 1: " );
        int num1 = in.nextInt();

        System.out.print("Enter the num 2: " );
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum: "+ sum);
    }
}
