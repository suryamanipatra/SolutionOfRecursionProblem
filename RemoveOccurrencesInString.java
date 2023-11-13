//Q. WAP to remove all occurrence of 'a' from the given string .
import java.util.Scanner;

public class RemoveOccurrencesInString {
    static String removeA(String str,int idx){
        if (idx == str.length()) return " ";
        String smallAns = removeA(str,idx+1);
        char currentChar = str.charAt(idx);
        if (currentChar != 'a') return currentChar + smallAns;
        else return smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeA(str,0));
    }
}
