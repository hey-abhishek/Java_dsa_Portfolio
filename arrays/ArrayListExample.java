package arrays;
import java.util.*;

import javax.swing.SwingContainer;
public class ArrayListExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //syntax
        ArrayList<Integer>list = new ArrayList<>(5);

        // list.add(1);
        // list.add(23);
        // list.add(132);
        // list.add(134);
        // list.add(154);
   
        // System.out.println(list.contains(23));

        // System.out.println(list);

        // list.set(0, 99);
        // list.remove(3);

        // System.out.println(list);



            for (int i = 0; i < 5; i++) {
                list.add(in.nextInt());
                
            }

            //get item at any index
            for (int i = 0; i < 5; i++) {
                System.out.println(list.get(i)); //pass index here, list[index] syntax will no work here.
            }
    }
    
}
