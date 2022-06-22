package DataStructure_Jan22;

public class DayEight {

    public static void matrixSnake(int[][] arr, int R, int C){

        for(int i=0; i<R; i++){
            if(i%2==0){
                for(int j=0; j<C; j++){
                    System.out.print(arr[i][j] + " " );
                }
            }else{
                for(int j=C-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

    }

    public static void matrixBoundaryTraversal(int[][] arr,int R, int C){

        if(R==1){
            for(int i=0; i<C; i++){
                System.out.print(arr[0][i] + " ");
            }
        }else if(C==1){
            for(int i=0; i<R; i++){
                System.out.print(arr[i][0] + " ");
            }
        }else{
            for(int j=0; j<C; j++){
                System.out.print(arr[0][j] + " ");
            }

            for(int j=1; j<R; j++){
                System.out.print(arr[j][C-1] + " ");
            }

            for(int j=C-2; j>=0; j--){
                System.out.print(arr[R-1][j] + " ");
            }

            for(int j=R-2; j>=1; j--) {
                System.out.print(arr[j][0] + " ");
            }
        }

        matrixBoundaryTraversal(arr, R-2, C-2);

    }

    public static int[][] transpose(int[][] mat){

        for(int i=0; i<mat.length; i++){
            for(int j=i+1; j<mat.length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        return mat;
    }

    public static void rotateImageClockwise(int[][] matrix){

        transpose(matrix);

        for(int i=0; i<matrix.length; i++){

            int start=0;
            int end = matrix.length-1;

            while (start<end){

                int temp= matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;
            }
        }

        for(int i = 0; i< matrix.length; i++)
        {
            for(int j = 0; j< matrix.length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void rotateImageAntiClockwise(int[][] matrix){

        transpose(matrix);

        for(int i=0; i<matrix.length; i++){

            int start=0;
            int end = matrix.length-1;

            while (start<end){

                int temp= matrix[start][i];
                matrix[start][i] = matrix[end][i];
                matrix[end][i] = temp;

                start++;
                end--;
            }
        }

        for(int i = 0; i< matrix.length; i++)
        {
            for(int j = 0; j< matrix.length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        int arr1[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        rotateImageClockwise(arr);
        System.out.println();
        rotateImageAntiClockwise(arr1);
    }

}
