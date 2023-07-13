package Binary_Search.on_Answers;

public class nth_root {
    public static void main (String[] args) {
        int n = 3, m = 512;
        System.out.println(getNthRoot(n, m));
        System.out.println(getNthRoot_BS(n, m));
//        System.out.println(getNthRoot_Inbuilt(n, m));
//        System.out.println((double)1/3);
    }

    private static int getNthRoot_Inbuilt(int n, int m) {
//        double 1 / 3;
        int num = (int)Math.pow(m , (double) 1 / n) ;
        return num;
    }

    private static int getNthRoot(int n, int m) {
        int num = 1;
        int ans = 0;
        while(Math.pow(num , n) <=m){
            if(Math.pow(num , n) == m){
                ans = num;
            }
            num++;
        }
        return ans;
    }
    private static int getNthRoot_BS(int n, int m) {
        int left = 1 , right = m;
        int num = 1;
        int ans = 0;
        while(Math.pow(left , n) <=m){
            int mid = left + (right-left)/2;
            if(Math.pow(mid , n) == m){
                return mid;
            } else if (Math.pow(mid , n)<m) {
                left = mid+1;
            }else right = mid-1;
        }
        return ans;
    }
}
