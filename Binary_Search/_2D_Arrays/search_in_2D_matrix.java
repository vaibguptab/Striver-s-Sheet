package Binary_Search._2D_Arrays;

public class search_in_2D_matrix {
    public static void main(String[] args) {
        int[][] arr = { { 1,3,5,7},{10,11,16,20},{23,30,34,60} };
        System.out.println(search(arr , 5));
    }

    private static boolean search(int[][] matrix ,int k) {
        int i=0,j=matrix[0].length-1;
        while (i>=0 && i< matrix.length && j>=0 && j<matrix[0].length){
            if (matrix[i][j] == k){
                return true;
            }
            else if (matrix[i][j] > k) j--;
            else if (matrix[i][j] < k) {
                i++;
            }
        }
        return false;
    }
}
