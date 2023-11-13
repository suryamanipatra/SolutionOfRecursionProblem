//Q. WAP to print sum of all elements present in an Array.
public class sumOfAnArray {
    static int sumInArray(int[] arr, int idx){
        if (idx == arr.length){
            return 0;
        }
        int smallAns = sumInArray(arr,idx+1);
        return smallAns + arr[idx];
    }
    public static void main(String[] args) {
        int[] arr = {5,4,2,1,8};
        System.out.println(sumInArray(arr,0));
    }
}
