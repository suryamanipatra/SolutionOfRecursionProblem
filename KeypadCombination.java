// Q. Given a String combination digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
// Return the answer in any order.
public class KeypadCombination {
    static void stringCombination(String s ,String[] kp, String res){
        if (s.length() == 0){
            System.out.print(res + " ");
            return;
        }
        int currNum =  s.charAt(0) - '0';
        String currChoice = kp[currNum];
        for (int i = 0; i < currChoice.length();i++){
            stringCombination(s.substring(1),kp,res + currChoice.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s = "253";
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        stringCombination(s,kp,"");
    }
}
