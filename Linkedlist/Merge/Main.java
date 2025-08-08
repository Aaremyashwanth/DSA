package Merge;

public class Main {
    public static void main(String[] args) {
        MergeLL mll=new MergeLL();
        mll.insertone(1);
        mll.insertone(2);
        mll.insertone(4);
        MergeLL ml2=new MergeLL();
        ml2.insertone(1);
        ml2.insertone(3);
        ml2.insertone(4);
        ml2.insertone(7);
        ml2.insertone(9);
        ml2.insertone(9);
        // System.out.println(mll);
        // System.out.println(ml2);
       //***this wont work****>>> mll.mergeTwoll(mll,ml2);|| create 'new object' then call this method 'mergeTwoll(mll,ml2)'
         MergeLL merged = mll.mergeTwoll(mll, ml2);
        System.out.println("Merged List: " + merged);
        // MergeLL otherobj=new MergeLL();
        // System.out.println(otherobj.mergeTwoll(mll, ml2));
        //otherobj.mergeTwoll(mll, ml2); wont work bcz, it give values, so need to save in some varable.
    }

    
}
