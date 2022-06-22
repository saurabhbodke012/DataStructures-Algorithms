package DSA_Jan2022;

public class Jan13 {

    private static void Nto1 (int n){

        if(n==0){
            return;
        }

        System.out.println(n);

        Nto1(n-1);

    }

    private static void reverse1toN (int n){

        if(n==0){
            return;
        }

        reverse1toN(n-1);
        System.out.println(n);

    }

    private static int factorial(int n){
        if(n==0){
            return 1;
        }

        return n*factorial(n-1);
    }

    private static int fibonacci(int n){
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int sum(int n){

        if(n==0){
            return 0;
        }

        return n+ sum(n-1);

    }

    private static boolean palindrome(String s, int start, int end){

        if(start>=end){
            return true;
        }

        return ((s.charAt(start) == s.charAt(end)) && palindrome(s, start+1, end-1));
    }


    private static int getSum(int n){

        if(n==0){
            return 0;
        }

        return n%10 + getSum(n/10);

    }


    private static int ropeCutting(int n, int a, int b, int c){

        if(n==0){
            return 0;
        }

        if(n <0){
            return -1;
        }

        int res=0;

        res= Math.max(ropeCutting(n-a,a,b,c),
               Math.max( ropeCutting(n-b,a,b,c),
                ropeCutting(n-c,a,b,c)));

        if(res==-1){
            return -1;
        }

        return res+1;
    }

    public static void main(String[] args) {
//        Nto1(5);
//        reverse1toN(5);
        String s="abccba";
        System.out.println(factorial(4));
        System.out.println(fibonacci(3));
        System.out.println(sum(5));

        System.out.println(palindrome(s,0,5));

        System.out.println(getSum(10));

        System.out.println(ropeCutting(23,12,11,9));
    }
}
