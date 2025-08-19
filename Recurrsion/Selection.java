package Recurrsion;
import java.util.*;
public class Selection {
    static public void selectionsorting(int[] arr,int l,int e,int max ){
        if(l==0){
            return;
        }
        if(e<=l){
            if(arr[e]>max){
                max=arr[e];
            }
            if(max>arr[e]){
                int temp=arr[e];
                arr[e]=max;
                arr[e-1]=temp;
            }
            selectionsorting(arr, l, e+1, max);
        }

        selectionsorting(arr, l-1, 0, 0);
    } 
    public static void main(String[] args) {
        int[] arr={2,9,6,5,8};
        selectionsorting(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
