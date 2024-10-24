import java.util.*;

class ArraList3{
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list.size());
    }
}