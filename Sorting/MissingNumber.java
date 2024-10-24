import java.util.*;

class MissingNumber{
    /**
     * Finds the missing number in an array of integers from 1 to n, where n is the length of the array plus 1.
     * The array may contain duplicate numbers, but there will be one number missing.
     * The method uses a swap-based approach to find the missing number.
     */
    public static void main(String[] args) {
        int arr[]={5,2,4,1,0};

        int n=arr.length;
        int i=0;
        while(i<n){
            int correct=arr[i];
            if(arr[i]<n && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<n;index++){
            if(arr[index]!=index){
                System.out.println(index);
            }
        }
    }

    private static void swap(int[] arr, int i, int correct) {
        int tem=arr[i];
        arr[i]=arr[correct];
        arr[correct]=tem;
    }
}