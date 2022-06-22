package DataStructure_Jan22;

public class DaySeven {

    public static int majorityElement(int[] arr){
        int res=0;
        int count=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[res]){
                count++;
            }

            if(i ==  arr.length-1){
                res++;
                i = res+1 ;
            }

            if(count > arr.length/2){
                return arr[i];
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {8,3,4,8,8};

        System.out.println(majorityElement(arr));

    }

}
