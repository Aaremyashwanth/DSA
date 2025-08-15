package Recurrsion;

public class Reverse {
    static int reversesum; 
    static public void rrr(int num){
        if(num%10==0){
            return;
        }
        int div= num%10;
        reversesum=reversesum*10+div;
        rrr(num= num/10);
        //System.out.println(reversesum);
    } 
    static public int reverse(int num){
        int digits=(int)Math.log10(num);
        return innerclass(num,digits);
       
        // int r=reverse(num/10);
        // int s=num%10;
        //  s=s*10;
        //  return s+r;

    }
    static public int innerclass(int num,int digits){
         if(num%10==num){
            return num;
        }
        int rem=num%10;
        return rem*(int)(Math.pow(10,digits))+innerclass(num/10,digits-1);
    }
    public static void main(String[] args) {
       // int result=reverse(12345);
        rrr(12345);
    
        System.out.println(reversesum);
    }
}
