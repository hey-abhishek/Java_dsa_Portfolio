package Recursion;

public class Fibo {
    public static void main(String[] args) {
        int n;
        System.out.println(fibo(7));
        
    }
    static int fibo(int n){

        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
