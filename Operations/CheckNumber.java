package Operations;

public class CheckNumber {
    public static void main(String[] args) {
        int number=22;
        int result=number%2;
        boolean res=result==0;
        System.out.println(res);

    //========swaping==============
    int one=99;
    System.out.println(one);
    int two=90;
    int temp=one;
    one=two;
    two=temp;
    System.out.println("one: "+one);
    System.out.println("TWO: "+two);
    
    //------------------Temprature convert-------------
         int f=32;
         int c=0;
        float celsias=(f-32)*9/5;
        float faranheit=(c+9/5)+32;
        System.out.println("Degrees: "+celsias);
        System.out.println(" f "+faranheit);
        //====================reverse the number============
       int Orginal=321;
        int given=Orginal;
        int One=given/10;
        int rev1=given%10;
        given=One;
       int Two= given/10;
       int rev2=given%10;
        given=Two;
        int rev3=given%10;
       
        System.out.println("Before :"+ Orginal+" reverse: "+rev1+rev2+rev3);
//******************loop*************** */

        int reverse=0;
        while (Orginal!=0) {
            int digit=Orginal%10;
            reverse=reverse*10+digit;
            Orginal=Orginal/10;

        }
        System.out.println("re: "+reverse);
int a=32;
int b=55;
int z=45;
boolean amax=a>b || a>z;
boolean bmax=b>z||b>a;
System.out.println("amax: "+amax);
System.out.println("bmax: "+bmax);

      
    
}
}
