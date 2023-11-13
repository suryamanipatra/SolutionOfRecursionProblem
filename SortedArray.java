//Q. Implement or check Array is sorted or not.
public class SortedArray {
    static boolean isSorted(int[] arr,int idx) {
        if (idx == arr.length-1) return true;
        if (arr[idx] < arr[idx+1]) return isSorted(arr,idx+1);
        else return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        if (isSorted(arr, 0)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

}