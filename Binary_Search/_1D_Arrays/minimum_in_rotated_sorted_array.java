package Binary_Search._1D_Arrays;

public class minimum_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] arr = { 3,4,5,1,2};
        System.out.println(min_in_rotated(arr));
    }

    private static int min_in_rotated(int[] arr) {
        int start = 0 , end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            // int mid = (start + end) / 2;
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }
            if (arr[start] <= arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
