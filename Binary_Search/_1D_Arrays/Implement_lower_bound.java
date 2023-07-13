package Binary_Search._1D_Arrays;

public class Implement_lower_bound {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,15,17,18};
        System.out.println(lower_bound(arr,16));
    }

    private static int lower_bound(int[] arr, int k) {
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
        return minindex;
    }
}
