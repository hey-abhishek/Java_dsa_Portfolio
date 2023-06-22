package conditions_and_loops;
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();


    //Q find the largest among the 3 number 

    // int max = a ;
    // if ( b > max ){
    //     max = b;

    // }
    // if ( c > max ){
    //     max = c;
    // }
//System.out.println("Max = "+ max);

int max  = Math.max(c, Math.max(a, b));

System.out.println((Math.max(34,57)));
System.out.println(max);

    }
    
}
