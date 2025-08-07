package Strings;

public class Palindrom {
    public static void main(String[] args) {
        String s="1A man, s plan,a canal:panama1";
        s=s.toLowerCase();
        System.out.println(s);
        StringBuilder OrginalName=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z')|| (ch>='0'&& ch<='9')) {
                OrginalName.append(ch);
            };
         
        };
        String cleaned=OrginalName.toString();
         String reversed=OrginalName.reverse().toString();
         if(cleaned.equals(reversed)){
            System.out.println("it is plaindrom");
         }else{
            System.out.println("this is not a plaindrom");
         }
    }
}
