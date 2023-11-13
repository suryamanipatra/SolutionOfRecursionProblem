// Q.WAP to return an ArrayList of all the indices of target in an Array  .
import java.util.ArrayList;

public class FindAllIndicesByArrayList {
    static ArrayList<Integer> findAllIndices(int[] arr, int target,int idx){
        ArrayList<Integer> ans = new ArrayList<>();
        if (idx >= arr.length) {
            return ans;
        }

        if (arr[idx] == target){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = findAllIndices(arr,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 4,1,2,3,2,5,2};
        int target = 2;
        ArrayList<Integer> ans = findAllIndices(arr,target,0);
        for (Integer i : ans){
            System.out.println(i);
        }
    }
}
