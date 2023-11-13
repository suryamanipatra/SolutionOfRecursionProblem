// Q. Given two numbers x and y , find the greatest common divisor of x and y using recursion.
import java.util.Scanner;
public class GCDofTwoNums {
    static int gcd(int x, int y){
        while(x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x,y));
    }
}
