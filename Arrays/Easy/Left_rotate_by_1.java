package Arrays.Easy;

public class Left_rotate_by_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr , 1);
        for(int e:arr) System.out.print(e + " ");
    }

    private static void rotate(int[] arr, int k) {
        int first = arr[0];
        for(int i=0;i< arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
    }
}
