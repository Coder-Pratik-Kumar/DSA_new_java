import java.util.*;

class Decimal_To_Binary{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n=sc.nextInt();

        ConertorBinary(n);
    }
    static void ConertorBinary(int n){
        int [] binary= new int[100];

        int i=0;
        while(n>0){
            binary[i]=n%2;
            n=n/2;
            i++ ;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]);
        }
    }
}