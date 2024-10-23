package strings;

class palindrome{
    public static void main(String[] args) {
    String str="pratik";

    int i=0;
    int j=str.length()-1;

    while(i<j){
        if(str.charAt(i)!=str.charAt(j)){
           break;
        }
        i++;
        j--;
    }
    if(i==j){
        System.out.println("palindrome");
    }
    else{
        System.out.println("not palindrome");

    }
}
}