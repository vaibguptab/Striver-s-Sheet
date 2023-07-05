package Arrays.Medium;

import java.util.ArrayList;

public class print_subarray_with_max_sum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4,2};
        System.out.println(print_subarray(arr,6));

        subarray_max(arr , arr.length , 6);
    }

    private static void subarray_max(int[] arr, int n, int k) {

    }

    private static ArrayList<Integer> print_subarray(int[] arr,int k) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            int sum=0;
            for (int j = i;j<arr.length;j++){
                sum += arr[j];
                if(sum==k){
                    for (int p=i;p<=j;p++)
                        System.out.print(arr[p] + " ");
                    System.out.println();
                }
            }
        }
        return list;
    }
}
