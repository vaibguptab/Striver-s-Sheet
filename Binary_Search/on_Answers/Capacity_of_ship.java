package Binary_Search.on_Answers;

public class Capacity_of_ship {
    public static void main(String[] args) {
        int[] arr = {500,500,500,500,500};
        System.out.println(capacity(arr , 3));
    }

    private static int capacity(int[] arr, int D) {
        int start = 0 , end = 500*arr.length/D;
        int res = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (possible(arr , mid , D)){
                end = mid-1;
                res = mid;
            }else {
                start = mid+1;
            }
        }
        return res;
    }
    public static boolean possible(int[] arr , int mid , int D){
        int totaldays = 1;
        int sum = 0;
        for (int i = 0 ;i <arr.length;i++){
            sum+= arr[i];
            if (sum>mid){
                sum = arr[i];
                totaldays++;
            }
            if (arr[i]>mid) return false;
        }
        if (totaldays > D) return false;
        else return true;
    }
}
