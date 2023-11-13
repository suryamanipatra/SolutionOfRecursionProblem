// Q. WAP to print all the indices of target in an Array.
public class FindAllIndices {
    static void findAllIndices(int[] arr,int target,int idx){
        if (idx >= arr.length) return ;
        if (arr[idx] == target){
            System.out.println(idx);
        }
        findAllIndices(arr,target,idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,4,7,4};
        int target = 4;
        findAllIndices(arr,target,0);
    }
}
