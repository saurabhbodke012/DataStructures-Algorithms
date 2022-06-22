package DataStructure_Jan22;

public class DaySix {

    public static int maxConsecutiveOnes(int[] arr){
        int count=0;
        int finalCount = 0;

        for(int i=0; i<arr.length; i++){

            if(arr[i] == 1){
                count ++;
            }else{
                count =0;
            }

            finalCount = Math.max(count,finalCount);
        }

        return finalCount;
    }

    public static int longestEvenSub(int[] arr){
        int count=1;
        int finalCount=0;

        int index=0;
        for(int i=1; i<arr.length; i++){

            if( (arr[index] % 2==0 && arr[i] %2 !=0) || (arr[index] % 2 !=0 && arr[i] %2 ==0) ){
                count++;
            }else{
                count =1;
            }

            index++;
            finalCount = Math.max(finalCount,count);
        }

        return finalCount;

    }

    public static void main(String[] args) {
        int[] arr={5,10,20,6,3,8};
        System.out.println(longestEvenSub(arr));
    }
}
