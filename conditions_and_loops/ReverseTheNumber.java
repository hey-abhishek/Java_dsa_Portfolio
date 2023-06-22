package conditions_and_loops;
import java.util.Scanner;
public class ReverseTheNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int tmp = 0;

        // while(n > 0){
        //     int rem = n % 10 ;
        //     tmp = rem ;
        //     n = n/10 ;
        //     System.out.print(tmp);
        // }



        //Method 2:

        while(n > 0){
            int rem = n % 10 ;
            n = n/10 ;
           
            tmp = tmp * 10 + rem ;
        }

        System.out.print(tmp);
    }

    
}
