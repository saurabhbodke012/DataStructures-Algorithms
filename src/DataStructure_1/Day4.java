package DataStructure_1;

import java.util.ArrayList;
import java.util.List;

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



    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<numRows;i++){

            ArrayList<Integer> list=new ArrayList<>();
            list.add(1);
            for(int j=1;j<=i-1;j++){
                list.add(result.get(i-1).get(j)+result.get(i-1).get(j-1));
            }
            if(i!=0)
                list.add(1);
            result.add(list);
        }
        return result;

    }






}
