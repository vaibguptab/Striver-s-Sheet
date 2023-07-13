package Binary_Search.on_Answers;

public class square_root {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(root(n));
        System.out.println(bs(n));
    }

    private static int bs(int n) {
        int low = 1 , high = n/2;
        int max = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid*mid == n) return mid;
            else if (mid * mid < n) {
                low = mid+1;
                max = mid;
            }else high = mid-1;
        }
        return max;
    }

    private static int root(int n) {
        int curr = 1 , max = 0;
        while (curr*curr <= n){
            if(curr * curr <= n && max != curr) max = curr;
            curr += 1;
        }
        return max;
    }
}
