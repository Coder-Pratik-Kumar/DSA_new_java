import java.util.*;

class SumPair{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(list.get(i)+list.get(j)==target){
                    System.out.println(list.get(i)+ " "+list.get(j));
                }
            }
        }
    }
}