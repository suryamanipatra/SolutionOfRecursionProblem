//Q. WAP to print all number from 1 to N.
import java.util.Scanner;
public class Print1ToN {
    static void printIncreasing(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number up to which you want to print");
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
