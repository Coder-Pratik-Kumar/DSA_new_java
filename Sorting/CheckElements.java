import java.util.*;

class CheckElements{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList <>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        System.out.println("Enter the element which you want to check:- ");
        int element= sc.nextInt();

        if(list.contains(element)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}