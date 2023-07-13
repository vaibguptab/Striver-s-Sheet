package Binary_Search._1D_Arrays;

public class peak_element {
    public static void main(String[] args) {
        int[] arr = {2,6,3,7,8,9};
        System.out.println(peak(arr));
    }

    private static int peak(int[] arr) {
        int start = 0,end = arr.length-1;
        int n = arr.length;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (mid==0){
                return arr[0]>=arr[1] ? arr[0] :arr[1];
            }
            if (mid == n-1)
                return arr[n-1]>=arr[n-2] ?arr[n-1] :arr[n-2];
            if (arr[mid] >= arr[mid-1] && arr[mid] >= arr[mid+1])
                return arr[mid];
            if (arr[mid]< arr[mid-1]) end = mid-1;
            else start=mid+1;
        }
        return -1;
    }
}
