package Arrays101;

public class ReplaceElements {

    public int[] replaceElements(int[] arr) {

        int start=0;
        int end= arr.length-1;

        int max= arr[end];


        for(int i=end-1; i>=0; i--){

            if(max < arr[i] ){
                int temp= max;
                max = arr[i];
                arr[i] = temp;
            }else if(arr[i] < max ){
                arr[i] = max;
            }

        }

        arr[end] = -1;

        return arr;
    }

}
