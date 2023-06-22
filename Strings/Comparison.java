package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "kunal";
        String b = "kunal";
        String c = a;

        System.out.println(c == a);

        // ==
        //System.out.println(a == b);

        String name1 = new String("kunal");
        String name2 = new String("kunal");


        System.out.println(name1 == name2); // "==" :- It is comparator
        System.out.println(name1.equals(name2)); //".equals" is a method or a function 
    }
    
}
