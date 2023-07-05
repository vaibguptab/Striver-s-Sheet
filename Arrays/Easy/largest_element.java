package Arrays.Easy;

public class largest_element {
    public static void main(String[] args) {
        int[] arr = {19,54,58,46,42,68,54,8};
        System.out.println(largest(arr));
    }

    private static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]) max = arr[i];
        }
        return max;
    }
}
