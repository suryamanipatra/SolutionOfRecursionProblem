//Q. WAP to find maximum element among all element in array.
public class maxValueInArray {
    static int maxInArray(int[] arr , int idx){
        if (idx == arr.length-1){
            return arr[idx];
        }
        int smallAns = maxInArray(arr,idx+1);
        return Math.max(arr[idx] , smallAns);
    }
    public static void main(String[] args) {
        int[] arr = {15,6,7,18,19};
        System.out.println(maxInArray(arr,0));
    }
}
