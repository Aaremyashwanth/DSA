package Recurrsion;

import java.util.Arrays;

public class Bubblesorting {
    static int[] arr={1,5,2,4,6};
    static public void bubblesort(int[]arr,int a,int col){
        if(a==0){
            return;
        }
        if(col<a){
            if(arr[col]>arr[col+1]){
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
                bubblesort(arr,a, col+1);
            }else{
                //col++;
                bubblesort(arr,a-1, 0);
            }
        }

    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        bubblesort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
}
