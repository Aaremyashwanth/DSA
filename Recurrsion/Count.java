package Recurrsion;

public class Count {
    static public int count(int count,int c){
        if(count%10==count){
            return c;
        }
        if(count%10==0){
             c+=1;
           return count(count/10, c);
        }
        return count(count/10, c);
       
    }
    public static void main(String[] args) {
        int number=1035001;
        int result=count(number,0);
        System.out.println(result);
    }
}
