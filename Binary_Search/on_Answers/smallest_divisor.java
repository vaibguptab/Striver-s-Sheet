package Binary_Search.on_Answers;

import java.util.Arrays;

public class smallest_divisor {
    public static void main(String[] args) {
        int[] arr = {44,22,33,11,1};
        System.out.println(small(arr , 5));
    }

    private static int small(int[] arr, int threshold) {
        int ans = -1;

        int low = 1 , high = Arrays.stream(arr).max().getAsInt();
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = check(arr, mid);

            if (result <= threshold){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
    public static int check(int[] arr , int mid){

        int res = 0;
        for (int num :arr){
            res += Math.ceil(1.0*num / mid);
        }
        return res;

//        int sum = 0;
//        for (int i = 0;i<arr.length;i++){
//            if(arr[i]%mid==0){
//                sum+=arr[i]/mid;
//            }else sum += arr[i]/mid+1;
//        }
//        return sum;
    }
}
