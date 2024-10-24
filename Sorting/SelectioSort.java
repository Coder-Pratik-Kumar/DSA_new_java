import java.util.*;

class SelectionSort{
    public static void main(String[] args) {
        int []arr={7,6,5,4,3,2,1};
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length;i++){
            int max=start;
            for(int j=start;j<=end;j++){
                if(arr[max]<arr[j]){
                    max=j;
                }
                int tem=arr[max];
                arr[max]=arr[end];
                arr[end]=tem;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}