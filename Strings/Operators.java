package Strings;

import java.util.*;

public class Operators{
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 4);
        System.out.println((char)('a'+ 4));

        System.out.println("a" + 1);
        // this is same as after a few steps: "a" + "1"
        // interger will be converted to Integer that will call toString()

        System.out.println("kunal" + new ArrayList<>());
        System.out.println("kunal" + new Integer(56));
        System.out.println(new ArrayList<>()  +""+ new Integer(56));
    }
    
}
