package Arrays.Medium;

public class Rotate_matrix_by_90 {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3} ,{4,5,6} , {7,8,9} };
        int[][] ans = rotate(arr);

        for (int[] e:ans ){
            for (int f:e) System.out.print(f+" ");
            System.out.println();
        }

    }

    private static int[][] rotate(int[][] arr) {
        int n = arr.length , m = arr[0].length;
        int[][] ans = new int[n][m];

        for (int i = 0;i<n;i++){
            for (int j=0;j<m;j++){
                ans[j][n-i-1] = arr[i][j];
            }
        }
        return ans;
    }
}
