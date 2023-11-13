// Q. Given two numbers p & q, find the value p^q using a recursive function(Optimize solution)Time complexity is O(log q)
public class AnotherApproachToFindPower {
    static int pow(int p , int q){
        if (q == 0){
            return 1;
        }
        int smallAns = pow(p , q / 2);
        if(q % 2 == 0){
            return smallAns * smallAns;
        }
        return p * smallAns * smallAns;
    }
    public static void main(String[] args) {
        System.out.println(pow(3,5));
    }
}
