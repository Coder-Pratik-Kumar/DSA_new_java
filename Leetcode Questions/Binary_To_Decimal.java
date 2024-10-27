import java.util.*;

class Bianry_To_decimal{
public static void main(String[] args) {
    double val=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the digits:- ");
    int digit=sc.nextInt();
    System.out.print("Enetr The Binary Number: - ");
      
    int [] binary=new int[digit];
    for(int a=0;a<binary.length;a++){
        binary[a]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<binary.length;i++){
         val=binary[binary.length-1-i]*Math.pow(2, i);
        System.out.println(val); 
        sum+=val;
    }
    
    
    System.out.println("Decimal Number is:- " +sum);
   
}
}