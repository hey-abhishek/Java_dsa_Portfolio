package Functions;

import javax.swing.SpringLayout;

public class Overloading {
    public static void main(String[] args) {
        fun(23);
        fun("abhishek");
        
        int ans = sum(23,32);
        int ans2 = sum(23,32,55);

        System.out.println(ans);
        System.out.println(ans2);
    }

    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println(a);;
    }
    static void fun(String name){
        System.out.println(name);
    }
    
}
