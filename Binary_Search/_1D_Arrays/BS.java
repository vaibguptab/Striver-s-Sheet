package Binary_Search._1D_Arrays;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Binary(arr,7));
    }

    private static int Binary(int[] arr,int k) {
        int start=0 , end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==k)      return mid;
            else if (arr[mid]<k) start = mid+1;
            else if (arr[mid]>k) end = mid-1;
        }
        return -1;
    }
}
