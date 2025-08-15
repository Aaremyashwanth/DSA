package Recurrsion;

public class OneToFive {
     static public void fun(int num){
        if(num==0){
            return;
        }
        System.out.println("Number :"+num);
        fun(num-1);
        System.out.println("Number :"+num);
    }
    public static void main(String[] args) {
        fun(5);
    }
}
