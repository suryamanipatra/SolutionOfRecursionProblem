//Q. WAP to find the index of first occurrence element in an Array.
public class LinearSearch2 {
        static int search(int[] arr , int target, int idx){
            if (idx >= arr.length){
                return -1;
            }
            if (arr[idx] == target){
                return idx;
            }
            return search(arr,target,idx+1);
        }
        public static void main(String[] args) {
            int[] arr = { 1,2,5,7,5,4,8};
            int target = 5;
            System.out.println(search(arr,target,0) );
        }
    }


