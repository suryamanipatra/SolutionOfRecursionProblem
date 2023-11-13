// Q. Given two numbers p & q, find the value p^q using a recursive function.Time complexity is O(q)
public class FindPower {
    static int pow(int p , int q){
        if (q == 0){
            return 1;
        }
       return pow(p , q - 1) * p  ;

    }
    public static void main(String[] args) {
        System.out.println(pow(5,4));
    }
}
