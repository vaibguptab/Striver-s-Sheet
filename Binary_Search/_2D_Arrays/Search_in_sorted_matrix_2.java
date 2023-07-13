package Binary_Search._2D_Arrays;

public class Search_in_sorted_matrix_2 {
    public static void main(String[] args) {
        int[][] arr = { { 1,3,5,7},{10,11,16,20},{23,30,34,60} };
        System.out.println(search_2(arr , 5));
    }

    private static boolean search_2(int[][] matrix, int k) {
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == k)return true;
            else if(matrix[row][col] > k)col--;
            else row++;
        }
        return false;
    }
}
