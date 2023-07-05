package Arrays.Easy;

public class Max_consecutive_1s {
    public static void main(String[] args) {
        int[] prices = {1, 1, 0, 1, 1, 1};
        System.out.println(max(prices));
    }

    private static int max(int[] arr) {
        int max = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==1) count+=1;
            else count=0;
            max = Math.max(count,max);
        }
        return max;
    }
}
