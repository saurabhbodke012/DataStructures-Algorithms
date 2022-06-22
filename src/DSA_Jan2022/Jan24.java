package DSA_Jan2022;

public class Jan24 {


    public static void name(int n){

        if(n == 0){
            return;
        }

        System.out.println("Saurabh");
        name(n-1);

    }

    public static void print(int n){

        if(n<=0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }

    public static void reversePrint(int n){
        if(n<=0 ){
            return;
        }

        System.out.println(n);
        reversePrint(n-1);

    }

    public static void main(String[] args) {
        name(5);
        System.out.println("------------------------");
        print(5);
        System.out.println("------------------------");
        reversePrint(5);
    }
}
