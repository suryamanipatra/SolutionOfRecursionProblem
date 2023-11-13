//Q. Given a number num and a value k. Print k multiplies of num.
import java.util.Scanner;
public class kMultiples {
    static void printKMultiples(int n , int k){
        if ( k == 1){
            System.out.println(n);
            return;
        }
        printKMultiples(n , k - 1);
        System.out.println(n * k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        printKMultiples(n , k);
    }
}
