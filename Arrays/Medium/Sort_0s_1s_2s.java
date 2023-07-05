package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort_0s_1s_2s {
    public static void main(String[] args) {
        ArrayList<Integer> arr;
        arr = new ArrayList<>(Arrays.asList(new Integer[]{0, 2, 1, 2, 0, 1}));
        sort012(arr);
        System.out.println(arr);
    }

    private static void sort012(ArrayList<Integer> arr) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) cnt0++;
            else if (arr.get(i) == 1) cnt1++;
            else cnt2++;
        }

        for (int i = 0; i < cnt0; i++) arr.set(i, 0);

        for (int i = cnt0; i < cnt0 + cnt1; i++) arr.set(i, 1);

        for (int i = cnt0 + cnt1; i < arr.size(); i++) arr.set(i, 2);
    }

    private static void print(int[] arr) {
        for (int e:arr) System.out.print(e+ " ");
    }
}
