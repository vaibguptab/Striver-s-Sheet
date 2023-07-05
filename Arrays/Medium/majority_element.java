package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class majority_element {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(major(arr));
    }

    private static int major(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value + 1);
        }

        for(Map.Entry<Integer,Integer> e :map.entrySet()){
            if(e.getValue() > arr.length/2)return e.getKey();
        }
        return -1;
    }
}
