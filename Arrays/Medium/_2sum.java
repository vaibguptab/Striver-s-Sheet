package Arrays.Medium;

import java.util.HashMap;

public class _2sum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        arr = sum2(arr,14);
        for(int e:arr) System.out.print(e+" ");
    }

    private static int[] sum2(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i=0;i<arr.length;i++){
            if (map.containsKey(k-arr[i])){
                res[1] = i;
                res[0] = map.get(k-arr[i]);
            }else{
                map.put(arr[i],i);
            }
        }
        return res;
    }
}
