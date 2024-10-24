import java.util.*;

class MergeArrayList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int n= sc.nextInt();
        int m= sc.nextInt();

        for(int i=0;i<n;i++){
            list1.add(sc.nextInt());
        }
        for(int i=0;i<m;i++){
            list2.add(sc.nextInt());
        }

        list1.addAll(list2);
        System.out.println(list1);
        for(int i=0;i<list1.size();i++){
            for(int j=i+1;j<list1.size();j++){
                if(list1.get(i)==list1.get(j)){
                    list1.remove(list1.get(j));
                }
            }
        
        }
        System.out.println(list1);
    }
}