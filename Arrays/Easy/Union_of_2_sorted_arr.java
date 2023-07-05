package Arrays.Easy;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Union_of_2_sorted_arr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};
        int[] temp = Union(arr1,arr2);
        for (int e:temp) System.out.print(e+" ");
    }

    private static int[] Union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int e:arr1)set.add(e);
        for(int e:arr2)set.add(e);
        int k = set.size();
        int[] temp = new int[k];
        int j=0;
        for (int e:set)temp[j++] = e;
        return temp;
    }
}
