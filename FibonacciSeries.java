// Q. Program to find nth fibonacci number.
public class FibonacciSeries {
    static int fibo(int n){
//        if ( n== 0)
//        {
//            return 0;
//        }
//        if (n == 1){
//            return 1;
//        }
        if (n == 0 || n == 1){
            return n;
        }
        int previous = fibo(n - 1);
        int prePrevious = fibo(n - 2);
        return previous + prePrevious ;
    }
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }
}
