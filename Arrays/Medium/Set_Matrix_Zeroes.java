package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] ans = matrixzeroes(arr);
        for (int[] e:ans){
            for (int f:e){
                System.out.print(f+" ");
            }
            System.out.println();
        }
    }

    private static int[][] matrixzeroes(int[][] arr) {
        int m = arr.length , n = arr[0].length;
//        ArrayList<Object[]> temp = new ArrayList<>();
//        int[] put = {-1,-1};
//        for (int i=0;i<m;i++){
//            for (int j=0;j<n;j++){
//                if (arr[i][j]==0){
//                    ArrayList<Integer> put2 = new ArrayList<>();
//                    put2.add(i);
//                    put2.add(j);
////                    put2.toArray();
//                    temp.add(put2.toArray());
//                }
////                }else {
////                    temp.add(put);
//            }
//        }
//        for (int i = 0;i<)
//        return new int[0][0];

        int[] col = new int[n];
        int[] row = new int[m];
        Arrays.fill(col,-1);
        Arrays.fill(row,-1);

        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (arr[i][j]==0){
                    col[j]=0;
                    row[i]=0;
                }
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (row[i]==0 || col[j]==0){
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }
}








