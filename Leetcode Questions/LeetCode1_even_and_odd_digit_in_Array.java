import java.util.*;
class Leetcode{
    public static void main(String[] args) {
        int [] arr={12,345,2,6,7896};
        int count=0;
        Digit(arr);
        even(count);
    }
    static void Digit(int[] arr ){
        for(int i=0;i<arr.length;i++){
            String str=Integer.toString(arr[i]);
        }
        while(str>0){
            str=str/10;
            count++;
        }
        }
    static void even(int count){
        if(count%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
