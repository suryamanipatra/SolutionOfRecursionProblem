// Q. Given a number n, find the sum of natural numbers till n but with alternative sign.
import java.util.Scanner;
public class SeriesSum {
    static int alternativeSignSum(int n){
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0){
            return alternativeSignSum(n - 1) - n;
        }
        else {
            return alternativeSignSum(n - 1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(alternativeSignSum(n));
    }
}
