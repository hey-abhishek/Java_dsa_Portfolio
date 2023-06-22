package Recursion;

public class NumberOfExampleRecursion {
    
    public static void main(String[] args) {
        // writes a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        print(1);
        
    }


    static void print(int num){
        if(num == 5){
            System.out.println(5);
            return;
        }
        System.out.println(num);

        // recursive call
        // if you are calling  a function again and again, you can treat it as a seperate call  in the stack
        // this is called tail recusrsion
        // cuz this is last function call
        print(num + 1);

    }
}
