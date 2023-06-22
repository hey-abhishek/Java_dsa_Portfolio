package Functions;

import java.util.Arrays;

public class VariableLengthArguments {
    public static void main(String[] args) {
        fun(2,3,4,56,7,8,9,90,89);
        multiple(5,7,"abhishek","kunal", "aryan","himanshu","gaurav");
    }

    static void multiple(int a, int b , String...v){
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }

    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
