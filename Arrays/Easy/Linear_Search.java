package Arrays.Easy;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(search(arr,3));
    }

    private static int search(int[] arr, int num) {
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
                return i;
        }
        return -1;
    }
}
