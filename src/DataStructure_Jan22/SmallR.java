package DataStructure_Jan22;

import java.util.*;
public class SmallR
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Prime Number except for 5: ");
        int number =sc.nextInt();

        if(number==5)
            System.out.println("The prime number should not be 5");
        else if(number<3 || number>999983)
            System.out.println("The prime number should be between 3 and 999983");
        else if(isPrime(number))
            System.out.println("The number should be a prime number");
        else
        {
            int temp=number-1;
            for(int i=1;i<=number;i++)
            {
                if(temp%i==0)
                {
                    if(helper(Math.pow(10,i),number)==1)
                    {
                        System.out.println("The Minimal r is: "+i);
                        break;
                    }
                }
            }
        }
    }

    static boolean isPrime(int n)
    {
        boolean flag = false;
        for(int i = 2; i <= n/2; ++i)
        {
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }
        return flag;
    }


    static int helper(double n, int p)
    {
        if(n<p){
            return (int)n;
        }

        int result = (10%p* helper(n/10,p)%p)%p;
        return result ;
    }
}
