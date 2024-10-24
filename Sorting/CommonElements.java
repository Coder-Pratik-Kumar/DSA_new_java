import java.util.*;

class CommonElements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList <> ();
        int n= sc.nextInt();
        int m= sc.nextInt();
        for(int i=0;i<n;i++){
            list1.add(sc.nextInt());
        }
        for(int i=0;i<m;i++){
            list2.add(sc.nextInt());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(list1.get(i)==list2.get(j)){
                    System.out.println(list1.get(i));
                }
            }
        }
    }
}