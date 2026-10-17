import java.util.*;
public class WordCheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        StringBuilder sb=new StringBuilder(word);
        String rev=sb.reverse().toString();
        System.out.println(word+(word.equals(rev)?" - palindrome":" - not a palindrome"));
        System.out.println(rev+(word.equals(rev)?" - palindrome":" - not a palindrome"));
    }
}
