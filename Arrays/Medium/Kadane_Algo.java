package Arrays.Medium;

public class Kadane_Algo {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(kadane(arr));
    }

    private static int kadane(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
            max = Math.max(sum,max);
            if(sum<0) sum =0;
        }
        return max;
    }
}
