package strings;

import java.util.*;
class shuffle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        int[] indices=new int[str.length()];
        for(int i=0;i<indices.length;i++){
            indices[i]=sc.nextInt();
        }
        char [] ans= new char[str.length()];
        for(int i=0;i<str.length();i++){
            ans[indices[i]]=str.charAt(i);
        }
        System.out.println(String.valueOf(ans));
    }
}