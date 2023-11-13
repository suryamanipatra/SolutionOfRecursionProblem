// Q.Check the given string is Palindrome or not.
import java.util.Scanner;

public class CheckForPalindrome {
    static String reverseingString(String s, int idx){
        if (idx == s.length()) return "";
        String smallAnswer = reverseingString(s,idx+1);
        char currentChar = s.charAt(idx);
        return smallAnswer + currentChar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String revString = reverseingString(s,0);
        if (revString.equals(s)){
            System.out.println(" String is palindrome");
        }
        else{
            System.out.println(" String is not palindrome");
        }
    }
}
