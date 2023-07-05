package Arrays.Easy;

import java.util.HashSet;

public class remove_duplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,3,3};

        int[] arr1 =remove_dupli(arr);

        int k =two_pointer(arr);
        for(int i=0;i<k;i++) System.out.print(arr[i] + " ");

        for (int e:arr1)System.out.print(e+" ");
    }

    private static int two_pointer(int[] arr) {
        int i=0;
        for (int j=0;j < arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    private static int[] remove_dupli(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int e:arr){
            set.add(e);
        }
        int k = set.size();
        int[] arr1 = new int[k];
        int j=0;
        for(int x:set){
            arr1[j++] = x;
        }
        return arr1;
    }

}
