package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class find_num_appearing_once {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(max_appearing(arr));
    }

    private static int max_appearing(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }else map.put(arr[i] , 1);
        }
        for (Map.Entry<Integer,Integer> it:map.entrySet()){
            if (it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;
    }
}
