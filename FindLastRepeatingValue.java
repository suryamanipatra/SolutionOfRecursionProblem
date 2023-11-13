// Q. WAP to return an index of last repeating value of a target in an Array.
public class FindLastRepeatingValue {
    static int findLastIndices(int[] arr, int target, int idx) {
        if (idx >= arr.length) return -1;
        int lastIdx = findLastIndices(arr,target,idx+1);
        if (lastIdx == -1){
            if (arr[idx] == target) return idx;
            else
                return -1;
        }
        else return lastIdx;

    }
        public static void main(String[] args) {
            int[] arr = {2,4,1,6,4,7,4};
            int target = 4;
       int ans =  findLastIndices(arr,target,0);
            System.out.println(ans);
        }
    }

