package Arrays101;

public class ValidMountain {
    public boolean validMountainArray(int[] arr) {

        boolean flag = false;
        int index=0;

        for(int i=0; i<arr.length-1; i++){

            if( arr[i] < arr[i+1] ){
                flag= true;
            }else if( arr[i] == arr [i+1] ){
                return false;
            }else if ( arr[i] > arr[i+1] && flag != false ){
                index=i;
                break;
            }else if(arr[i] > arr[i+1] && flag == false ){
                return false;
            }

        }

        if(flag == true){
            for(int i=index; i<arr.length-1; i++){
                if(arr[i]>arr[i+1] ){
                    flag= true;
                }else if(arr[i] < arr[i+1]){
                    return false;
                }else if(arr[i] == arr[i+1]) {
                    return false;
                }
            }
        }

        return flag;

    }

}
