package strings;

import java.util.*;
class defanging{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='.'){
                sb.append("[.]");
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}