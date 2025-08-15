package Recurrsion;

public class Factorial {
    static public int factorial(int num){
        if(num==1){
            return  num*num;
        }
        // int s=1;
        // s=factorial(num-1);
        // s=num*s;
        // return s;
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
      int result= factorial(5);
      System.out.println(result);
        
    }
}
