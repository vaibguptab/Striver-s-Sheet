package Binary_Search._2D_Arrays;

public class peak_element_in_2D_matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,4},{3,2}};
        int[] ans = peak(arr);
        for(int e:ans) System.out.print(e+" ");
    }

    private static int[] peak(int[][] mat) {
        int startCol = 0, endCol = mat[0].length-1;
        while(startCol <= endCol){
            int maxRow = 0, midCol = startCol + (endCol-startCol)/2;
            for(int row=0; row<mat.length; row++){
                maxRow = mat[row][midCol] >= mat[maxRow][midCol]? row : maxRow;
            }

            boolean leftIsBig = midCol-1 >= startCol && mat[maxRow][midCol-1] > mat[maxRow][midCol];
            boolean rightIsBig = midCol+1 <= endCol && mat[maxRow][midCol+1] > mat[maxRow][midCol];

            if(!leftIsBig && !rightIsBig)
                return new int[]{maxRow, midCol};
            else if(rightIsBig)
                startCol = midCol+1;
            else
                endCol = midCol-1;
        }
        return null;
    }
}
