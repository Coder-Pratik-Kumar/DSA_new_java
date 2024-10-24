import java.util.*;

class MissingNumbers2{
    public static void main(String[] args) {
        int[] arr={5,3,4,1,7};

        int n=arr.length;
        int i=0;
        int correct=arr[i]-1;
        while(i<n){
            
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
        for(int index=0;index<n;index++){
            if(arr[index]!=index+1){
                System.out.println(index);
            }
        }
    }
}