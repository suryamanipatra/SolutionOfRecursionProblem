//Q. Given an Array of n integers and a target and a target value x.Print whether x exist in the Array or not.
public class LinearSearch {
    static boolean search(int[] arr , int target, int idx){
        if (idx >= arr.length){
            return false;
        }
        if (arr[idx] == target){
            return true;
        }
        return search(arr,target,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = { 1,2,5,7,4,8};
        int target = 9;
      if (search(arr,target,0)) {
          System.out.println("Yes");
      }else {
          System.out.println("No");
      }
    }
}
