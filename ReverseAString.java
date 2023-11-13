//Q. WAP to print reverse of a string using recursion.
import java.util.Scanner;

public class ReverseAString {
    static String reverseingString(String s, int idx){
        if (idx == s.length()) return "";
        String smallAnswer = reverseingString(s,idx+1);
        char currentChar = s.charAt(idx);
        return smallAnswer + currentChar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
        System.out.println(reverseingString(s,0));
    }
}
