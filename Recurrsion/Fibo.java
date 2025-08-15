package Recurrsion;

public class Fibo {
    static public int fib(int num){
        if(num<2){
            return num;
        }
        return fib(num-1)+fib(num-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
        
    }
}
