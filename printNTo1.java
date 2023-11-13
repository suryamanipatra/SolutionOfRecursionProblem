// Q. Write a program to print all natural numbers from n to 1 using recursion.
import java.util.Scanner;

public class printNTo1 {
    static void printDecreasing(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        printDecreasing(n);
    }
}
