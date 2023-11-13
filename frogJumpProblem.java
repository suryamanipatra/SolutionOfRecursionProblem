// Q. There are N stones , numbered 0,1,2 .... N-1. For each i (0 <= i < N), the height of stone i is hi.
//There is a frog who is initially on Stone 0. he will repeat the following action some number of times to reach Stone N-1;
//1. if the frog is currently on stone i, jump to stone i+1 or Stone i+2.
//2. Here, a cost of |h[i] - h[j]| is incurred,where j is the Stone to land on.
//Find the minimum possible total cost incurred before the frog reaches Stone N.
public class frogJumpProblem {
    static int bestMinCost(int[] h,int n,int idx){
        if (idx == n-1) return 0;
        int option1 = Math.abs(h[idx] - h[idx+1]) + bestMinCost(h,n,idx+1);
        if (idx == n-2) return option1;
        int option2 = Math.abs(h[idx] - h[idx+1]) + bestMinCost(h,n,idx+2);
        return Math.min(option1,option2);

    }
    public static void main(String[] args) {
        int[] h = {10,30,40,20};
        System.out.println(bestMinCost(h,h.length,0));
    }
}
