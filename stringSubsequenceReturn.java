//Q. WAP to return all subsequences in an ArrayList of a given String.
import java.util.ArrayList;

public class stringSubsequenceReturn {
   static ArrayList<String> subSqString(String s){
        ArrayList<String> ans = new ArrayList<>();
        if (s.isEmpty())
        {
         ans.add(" ");
         return ans;
        }
        char currentChar = s.charAt(0);
        ArrayList<String> smallAns = subSqString(s.substring(1));
        for (String ss :smallAns){
            ans.add(ss);
            ans.add(currentChar + ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = subSqString("abcd");
        for (String ss : ans){
            System.out.println(ss);
        }
    }
}
