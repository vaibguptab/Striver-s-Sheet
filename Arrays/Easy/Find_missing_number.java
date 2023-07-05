package Arrays.Easy;

public class Find_missing_number {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(missing(arr));
    }

    private static int missing(int[] arr) {
        int[] hash = new int[arr.length+1];

        for(int i=0;i<arr.length-1;i++){
            hash[arr[i]]++;
        }

        for(int i=1;i<=arr.length;i++){
            if(hash[i]==0) return i;
        }
        return -1;
    }
}
