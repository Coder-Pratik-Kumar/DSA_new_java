import java.util.*;
class Insertion{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");
        int size=sc.nextInt();
        int [] arr= new int [size];
        int n =arr.length;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sorting:- ");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println("Array after sorting:- ");
        System.out.println(Arrays.toString(arr));
    }
}