package Arrays.Easy;

public class left_rotate_by_d_places {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate_by_d_place(arr , 2,"left");
        for(int e:arr) System.out.print(e + " ");

        System.out.println();
        int[] arr2 = {1,2,3,4,5,6,7};
        rotate_by_d_place(arr2 , 2,"right");
        for(int e:arr2) System.out.print(e + " ");
    }

    private static void rotate_by_d_place(int[] arr, int k,String dir) {
        if(dir == "left") rotate_d_left(arr,k);
        else rotate_d_right(arr,k);
    }

    private static void rotate_d_right(int[] arr, int k) {
        while(k>0){
            int last = arr[arr.length-1];
            for(int i=arr.length-2;i>=0;i--){
                arr[i+1] = arr[i];
            }
            arr[0] = last;
            k--;
        }
    }

    private static void rotate_d_left(int[] arr, int k) {
        while(k>0){
            int first = arr[0];
            for(int i=0;i< arr.length-1;i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = first;
            k--;
        }
    }
}
