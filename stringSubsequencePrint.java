//Q. WAP to print all subsequence of a given string.
public class stringSubsequencePrint {
    static void printSubsequence(String s,String currentAns){
        if (s.isEmpty()){
            System.out.println(currentAns);
            return;
        }
        char currentChar = s.charAt(0);
        String remString = s.substring(1);
        printSubsequence(remString,currentAns + currentChar);
        printSubsequence(remString,currentAns);
    }
    public static void main(String[] args) {
        printSubsequence("abc","");
    }
}
