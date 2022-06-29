package Recursion_II;

public class search2Dmatrix_II {

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int rows= matrix.length - 1;
        int columns= matrix[0].length - 1;

        return helper(matrix, target, 0, rows, 0, columns);

    }


    public boolean helper(int[][] matrix, int target, int top, int bottom, int left, int right){


        if( top > bottom || left > right){
            return false;
        }

        int midpoint_row = top + ( bottom - top ) / 2;
        int midpoint_col = left + ( right - left ) / 2;

        int element = matrix[midpoint_row][midpoint_col];

        if( top == bottom && left == right && target != element ){
            return false;
        }

        if( target == element){
            return true;
        }

        if( target < element) {

            return helper(matrix, target, top, midpoint_row-1, left, right ) ||
                    helper(matrix, target, midpoint_row, bottom,left, midpoint_col-1 );

        }

        return helper(matrix, target, top, midpoint_row, midpoint_col+1, right ) ||
                helper(matrix, target, midpoint_row+1, bottom,left, right );


    }


}
