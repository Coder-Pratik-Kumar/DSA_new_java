import java.util.*;

class Array_2D{
    public static void main(String[] args) {
        int [][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int target=sc.nextInt();
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] matrix,int target){
        int lowerBound=0;
        int UpperBound=matrix.length-1;

        while(lowerBound<matrix.length && UpperBound>=0){

            if(matrix[lowerBound][UpperBound]==target){
                return new int[]{lowerBound,UpperBound};
            }else if(matrix[lowerBound][UpperBound]<target){
                lowerBound++;
            }else{
                UpperBound--;
            }
        }
        return new int[] {-1,-1};
    }
}