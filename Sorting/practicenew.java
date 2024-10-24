import java.util.*;

class practicenew{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        
        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int sum=0;
            while(arr[i]!=0){
                int r=arr[i]%10;
                sum=sum+r;
                arr[i]=arr[i]/10;
            }
        if(sum%2==0 && sum%4==0 || sum%2!=0 && sum%3==0){
            System.out.println("yes");
        }else {
            System.out.println("no");

        }
        }

    }
}