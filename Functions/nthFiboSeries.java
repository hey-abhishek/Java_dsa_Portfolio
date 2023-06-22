package Functions;
import java.util.*;
public class nthFiboSeries{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //System.out.print("enter the nth number: ");
    //int n = in.nextInt();

    //Fibo(n);
    int n = 7;
   
     Fibo(n);

    }

    static void Fibo(int n ){
    int a = 0; 
    int b = 1;
    

   for (int count  = 1; count <= n; count++) {

    int temp = b;
    b = b + a;
    a = temp; 
    System.out.print("["+a + ""+"]");   
    }
   
    }
    
}
