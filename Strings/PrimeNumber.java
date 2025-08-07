package Strings;

public class PrimeNumber {
    public static void main(String[] args) {
        //int number=9;
        //*************individuals logic is not working***************** */
        //  int iseven=number%2;
        // int sq=(int)Math.sqrt(number);
        // System.out.println("Square value is :"+sq);
        // if(iseven!=0 &&  number>=2 && number!=(sq*sq)){
        //     System.out.println(number+": number is prime");
        // }else{
        //     System.out.println(number+": number is not prime");
        // }
        
















        // //*********interlinked logic is working************ */
        int number=18;
        boolean isprime=true;
        if(number<=1){
            isprime=false;
        }else{
        //     //* it will termiate in two way */
        //     //* Math.sqrt() is =>2 */&& 'i' will iterate upto i<= Math.sqrt()
            for(int i=2;i<=Math.sqrt(number);i++){
                
                if(number%2==0){
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime){
            System.out.println(number+": isprime");
        }else{
            System.out.println(number+": not prime");
        }
    }
}
