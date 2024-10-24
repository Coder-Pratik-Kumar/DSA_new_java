//if arr=[2,3,5,9,14,16,18] and target=15 then output=16
//ceiling of an array is the smallest element in an array greater or equal to target

import java.util.*;

class Ceiling_of_an_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,5,9,14,16,18};
        System.out.println("Enter the target element:");
        int target=sc.nextInt();

        int start=0;
        int end=arr.length-1;

        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                System.out.println("Ceiling of an array is:"+arr[mid]);
                break;
            }
            
        }

System.out.println("Ceiling is:- "+arr[start]);
    }
}