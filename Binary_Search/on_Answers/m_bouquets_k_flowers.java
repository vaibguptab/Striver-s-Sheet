package Binary_Search.on_Answers;

import java.util.Arrays;

public class m_bouquets_k_flowers {
    public static void main(String[] args) {
         int[] bloom = {1,10,3,10,2};
        System.out.println(solve(bloom ,3,1 ));
        System.out.println(bloomm(bloom , 3 , 1));
    }

    private static int solve(int[] bloom, int m, int k) {
        int max = 1_000_000_001;
        int left = 0 , right = max;
        while (left<right){
            int mid = (right + left)>>1;
            if (check(bloom , mid , k)>=m){
                right = mid;
            }
            else left = mid+1;
        }
        return left == max ? -1 : left;
    }

    static int check(int[] bloomDay, int day, int k){
        int count = 0;
        int t = 0;
        for(int d : bloomDay){
            if(d > day){
                t = 0;
            }else{
                t++;
            }
            if(t == k){
                count++;
                t = 0;
            }
        }
        return count;
    }

    private static int bloomm(int[] A, int m, int k) {
        int n = A.length, left = 1, right = (int)1e9;
        if (m * k > n) return -1;
        while (left < right) {
            int mid = (left + right) / 2, flow = 0, bouq = 0;
            for (int j = 0; j < n; ++j) {
                if (A[j] > mid) {
                    flow = 0;
                } else if (++flow >= k) {
                    bouq++;
                    flow = 0;
                }
            }
            if (bouq < m) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }


}
