package Functions;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.event.SwingPropertyChangeSupport;
public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // System.out.print("Enter Your name: ");

        // String name = in.next();

        // String ans = greet(name);
        // System.out.print(ans);

       mygreet("Abhishek");
    }   

    //Function with Areguments and with return type
//     static String greet(String name){
//         String message = "Hello "+ name;
//         return message;
//     }


// Function with parameter and without return type

static void mygreet(String name){
    System.out.println("Hello "+ name);
}
}
