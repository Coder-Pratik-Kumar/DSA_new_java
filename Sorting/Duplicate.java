
class Duplicate{
    public static void main(String[] args) {
        int arr[]={5,3,2,2,1};

        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int correct=arr[i]-1;
                if(arr[i]!=correct){
                    int tem=arr[i];
                    arr[i]=arr[correct];
                    arr[correct]=tem;
                }else{
                    System.out.println(arr[i]);
                }
            }else{
                i++;
            }
        }
        System.out.println(arr[i]);
    }
}