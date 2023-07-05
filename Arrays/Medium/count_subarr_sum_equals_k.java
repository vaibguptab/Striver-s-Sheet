package Arrays.Medium;

public class count_subarr_sum_equals_k {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(count_subarr(arr , 6));
        System.out.println(count_subarr2(arr , 6));
    }

    private static int count_subarr2(int[] arr, int k) {
        int n = arr.length , cnt = 0;
        for (int i=0;i<n;i++){
            int sum = 0;
            for (int j=i;j<n;j++){
                sum+= arr[j];
                if (sum==k)cnt++;
            }
        }
        return cnt;
    }

    private static int count_subarr(int[] arr, int K) {
        int n = arr.length , cnt = 0;
        for (int i=0;i<n;i++){
            for (int j = i;j<n;j++){
                int sum = 0;
                for (int k = i;k<=j;k++) sum += arr[k];

                if (sum==K) cnt++;
            }
        }
        return cnt;
    }
}
