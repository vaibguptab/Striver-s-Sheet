package Arrays.Medium;

import java.util.ArrayList;

public class Rearrange_arr_by_sign {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,-1,-2,3};
//        rearrange(arr);
        int[] ans = rearrange_better(arr);
        for (int e:ans) System.out.print(e+" ");
    }

    private static int[] rearrange_better(int[] arr) {
        int i=0,j=1;
        int[] ans = new int[arr.length];
        int idx = 0;
        while(idx<arr.length){
            if (arr[idx]<0){
                ans[i] = arr[idx];
                i+=2;
            }else{
                ans[j] = arr[idx];
                j+=2;
            }
            idx++;
        }
        return ans;
    }

    private static void rearrange(int[] arr) {
        ArrayList<Integer> posi = new ArrayList<>();
        ArrayList<Integer> negi = new ArrayList<>();
        for (int e:arr){
            if (e<0) negi.add(e);
            if (e>0) posi.add(e);
        }
        for (int i=0;i<arr.length/2;i++){
            arr[2*i] = posi.get(i);
            arr[2*i+1] = negi.get(i);
        }

    }
}
