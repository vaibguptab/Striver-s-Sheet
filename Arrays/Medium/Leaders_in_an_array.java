package Arrays.Medium;

import java.util.ArrayList;

public class Leaders_in_an_array {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        System.out.println(leader(arr));
    }

    private static ArrayList<Integer> leader(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0;i<arr.length;i++){
            boolean leader = true;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]>arr[i]){
                    leader = false;
                    break;
                }
            }

            if (leader)list.add(arr[i]);
        }
        return list;
    }
}
