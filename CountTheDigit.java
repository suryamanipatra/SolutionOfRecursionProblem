// Q. Return the count of digits in a given number n.[if n = 5683 the o/p is 4]
public class CountTheDigit {
    static int countDigits(int n){
        if (n >=0 && n <= 9){
            return 1;
        }
        int smallAns = countDigits(n / 10);
        return smallAns + 1;
    }
    public static void main(String[] args) {
        System.out.println(countDigits(12345671));
    }
}
