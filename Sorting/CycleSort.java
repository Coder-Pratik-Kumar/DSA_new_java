import java.util.*;

class CycleSort{
    public static void main(String[] args) {
        int arr[]={2,69,23,3,45};
        int i=0;
        int n=arr.length;
        while(i<n){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}