package strings;
class toggle{
    public static void main(String[] args) {
        String str= "PrAtik";
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(Character.toLowerCase(ch)==ch){
                sb.append(Character.toUpperCase(ch));
            }else{{
                sb.append(Character.toLowerCase(ch));
            }
        }
    }
    System.out.println(sb.toString());
}
}
       