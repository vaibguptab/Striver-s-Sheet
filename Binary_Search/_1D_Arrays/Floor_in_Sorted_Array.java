package Binary_Search._1D_Arrays;

public class Floor_in_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,15,17,18};
        int[] ans = floor_ceil(arr,6);
        for (int e:ans) System.out.print(e+" ");
    }

    private static int[] floor_ceil(int[] arr, int k) {
        int f = floor(arr , k);
        int c = ceil(arr , k);
        return new int[] {f,c};
    }

    private static int ceil(int[] arr, int k) {
        int start=0 , end = arr.length-1;
        int index = 0;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]<=k){
                start = mid+1;
            }
            else if (arr[mid]>k) {
                index = mid;
                end = mid-1;
            }
        }
        return arr[index];
    }

    private static int floor(int[] arr, int k) {
        int start=0 , end = arr.length-1;
        int minindex = 0;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]<k){
                start = mid+1;
                minindex = mid;
            }
            else if (arr[mid]>=k) end = mid-1;
        }
        return arr[minindex];
    }
}
