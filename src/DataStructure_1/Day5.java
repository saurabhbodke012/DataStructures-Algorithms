package DataStructure_1;

import java.util.HashSet;

public class Day5 {

    public boolean searchMatrix(int[][] matrix, int target) {

        int rows= matrix.length;
        int col= matrix[0].length;

        if(rows == 0){
            return false;
        }

        int left= 0;
        int right= rows*col - 1;
        int midpoint =0;
        int midpoint_element=0;

        while(left<=right){

            midpoint = (left+right)/2 ;
            midpoint_element = matrix[midpoint/col][midpoint%col];

            if(target == midpoint_element ){
                return true;
            }else{
                if(target < midpoint_element){
                    right= midpoint -1;
                }else{
                    left= midpoint +1;
                }
            }
        }

        return false;

    }

    public boolean isValidSudoku(char[][] board) {

        int rows= board.length;
        int cols= board[0].length;

        HashSet<String> set = new HashSet<>();

        for(int i=0; i<rows; i++){

            for(int j=0; j<cols; j++){

                if(board[i][j] != '.'){
                    if(!set.add(board[i][j] + "row-" + i) ||!set.add(board[i][j] + "col-" + j) ||                            !set.add(board[i][j] + "boxes-" + ((i/3)*3+j/3 )) ){

                        return false;

                    }

                }

            }

        }

        return true;



    }


}
