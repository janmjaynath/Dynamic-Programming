import java.util.*;

public class Fibonacchi{

    //Memoization
     public static int Fib(int n , int f[] ){    //it takes time complexcity 0(n)
        if(n == 0 || n == 1){
            return n;
        }

            if(f[n] != 0){
                return f[n];
            }
            f[n] = Fib(n-1 ,f) + Fib(n-2,f);
            
        return f[n];
       
    }

    public static int Fib(int n){     // it takes time complexcity 0(n)
        int f[] = new int[n+1];
        f[0] = 0;
        f[1] = 1;

        for(int i=2;i<=n;i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int fib[] = new int[n+1];
        
        // System.out.println(Fib(n,fib));
        System.out.println(Fib(n));
    }
}