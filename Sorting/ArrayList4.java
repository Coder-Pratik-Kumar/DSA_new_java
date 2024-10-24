import java.util.*;

class ArrayList4{
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        sort(list);
    }
    static void sort(ArrayList<Integer> list){
        Collections.sort(list);
        System.out.println(list);
    }
}