package Binary_Search._1D_Arrays;

public class Rotated_Sorted_1 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(rotated(arr,1));
    }

    private static int rotated(int[] arr, int k) {
        int start = 0, end = arr.length - 1;
        int index = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid]==k) return mid;
            if(arr[start] <= arr[mid]){
                if (arr[start]<=k && arr[mid]>=k)
                    end = mid-1;
                else start = mid+1;
            }
            else {
                if (arr[mid]<=k && k<=arr[end])
                    start = mid+1;
                else end = mid-1;
            }
        }
        return -1;
    }
}
