package Arrays.Easy;

public class second_largest {
    public static void main(String[] args) {
        int[] arr = {19,54,58,46,42,68,54,8};
        System.out.println((second(arr)));
    }

    private static int second(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]) max = arr[i];
        }

        int second = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){

            if(second <arr[i] && arr[i]<max) second = arr[i];
        }
        return second;
    }
    
}
