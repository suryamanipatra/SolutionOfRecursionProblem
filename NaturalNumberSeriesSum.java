// Q. find the sum of All natural n numbers .
import java.util.Scanner;

public class NaturalNumberSeriesSum {
    static int seriesSum (int n){
        if (n == 0) {
          return 0 ;
        }
      return   seriesSum(n - 1) + n ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriesSum(n));
    }
}
