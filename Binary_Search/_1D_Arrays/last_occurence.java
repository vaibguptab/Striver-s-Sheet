package Binary_Search._1D_Arrays;

public class last_occurence {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,15,15,17,17,17,17,18,18,18};
        System.out.println(last_occ(arr,17));
    }

    private static int last_occ(int[] arr, int k) {
        int start=0 , end = arr.length-1;
        int index = 0;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid]<=k){
                start = mid+1;
            }
            else if (arr[mid]>k) {
                index = mid;
                end = mid-1;
            }
        }
        return index-1;
    }
}
