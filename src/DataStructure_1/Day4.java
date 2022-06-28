package DataStructure_1;

import java.util.ArrayList;

public class Day4 {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int elements1= r*c;
        int elements2 = mat.length * mat[0].length;

        if (elements1 == elements2){
            ArrayList<Integer> store = new ArrayList<>();

            int[][] reshapeMat = new int[r][c];

            for (int[] row : mat){
                for (int ind: row){
                    store.add(ind);
                }
            }

            int counter =0;
            for (int i=0;i<r; i++){
                for (int j=0;j<c;j++){
                    reshapeMat[i][j]= store.get(counter);
                    counter++;
                }
            }

            return reshapeMat;

        }else {
            return mat;
        }

    }






}
