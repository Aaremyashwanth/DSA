package Strings;
public class LargestOddNimber {
    static String nums="49087";
    static public String largeodd(String nums){
        String bigodd="No odd";
        
        //char[] individual=nums.toCharArray();
        int odd=-1;
        for(int i=0;i<nums.length();i++){
            char v=nums.charAt(i);
            int index=0;
            int value=Character.getNumericValue(v);
            
            if(value%2==1 && (odd<value)){
                odd=value;
                index=i;
                String c=String.valueOf(odd);
                bigodd=c;  
                System.out.println("index :"+index);
            }
            
            
        }
        return bigodd;
    }
    public static void main(String[] args) {
        String output=largeodd(nums);
        System.out.println(output);
    }

}
