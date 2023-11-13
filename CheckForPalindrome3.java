// Q.Check the number is palindrome or not.
import java.util.Scanner;

public class CheckForPalindrome3 {
    static int isPalindrome(int num,int sum ){
//        if (num == 0) return true;
        if (num == 0) return sum;
        sum = (sum * 10) +(num%10);
        return isPalindrome(num/10,sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int rev = isPalindrome(num,sum);
        if (num == rev){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }
}
