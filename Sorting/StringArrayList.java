import java.util.*;

class StringArrayList{
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        System.out.println(list);
        System.out.println("Enter the index number which you want to delete:- ");
        int index = sc.nextInt();
        list.remove(list.get(index));
        System.out.println(list);
    }
}