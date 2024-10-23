package strings;
import java.util.*;
class methods{
    public static void main(String[] args) {
        String name="Pratik";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('e'));
        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(name.substring(1,3));
        System.out.println(name.substring(1));
        System.out.println(name.contains("Aniket"));
        System.out.println(name.contains("Aniket"));
        System.out.println(name.isEmpty());
        System.out.println(name.strip());
        System.out.println(name.stripLeading());
        System.out.println(name.stripTrailing());
        System.out.println(name.trim());
        System.out.println(name.replace('e','a'));
        System.out.println(name.replace("Aniket","Aniket"));
        
    }
}