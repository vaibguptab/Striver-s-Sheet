package Arrays.Easy;

public class Move_0_to_end {
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        arr = move_0(arr);
        for(int e:arr) System.out.print(e+" ");

        int[] arr2 = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        move_0_(arr2);
        for(int e:arr2) System.out.print(e+" ");

    }

    private static void move_0_(int[] arr) {
        int k = 0;
        while (k < arr.length) {
            if (arr[k] == 0)break;
            else k = k + 1;
        }
        int i = k, j = k + 1;

        while (i < arr.length && j < arr.length) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
    }

    private static int[] move_0(int[] arr) {
        int k =0;
        int temp[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[k++] =arr[i];
            }
        }
        while(k<arr.length)temp[k++] = 0;
        return temp;
    }
}
