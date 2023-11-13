// Q. Given an integer, find out the sum of its digits using recursion.
public class SumOfDigit {
    static int sumOfDigit(int n){
        if (n >= 0 && n <= 9){
            return n;
        }
       int smallAns =  sumOfDigit(n/10);
        return smallAns + n%10;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigit(1234));
    }
}
