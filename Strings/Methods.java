package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "kunal Kushwaha";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("       kunal      ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
    
}
