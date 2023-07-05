package Arrays.Medium;

import java.util.ArrayList;

public class spiral_traverse {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4} , {5,6,7,8},{9,10,11,12},{13,14,15,16} };
        System.out.println(spiral(arr));
    }

    private static ArrayList<Integer> spiral(int[][] arr) {
        int n = arr.length , m=arr[0].length;
        ArrayList<Integer> ans = new ArrayList<>();

        int top = 0 , left = 0 , right = m-1 , bottom = n-1;
        while (top<=bottom && left<=right){
            for (int i = left;i<=right ; i++) ans.add(arr[top][i]);
            top++;

            for (int i=top;i<=bottom ; i++) ans.add(arr[i][right]);
            right--;

            if (top<=bottom){
                for (int i = right ; i>=left ; i--) ans.add(arr[bottom][i]);
                bottom--;
            }

            if (left<=right){
                for (int i =bottom;i>=top ; i--) ans.add(arr[i][left]);
                left++ ;
            }
        }
        return ans;
    }

}
