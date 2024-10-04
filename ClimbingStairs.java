import java.util.*;
public class ClimbingStairs {
    
    public static int WaysCount(int n,int ways[]){     //0(n)

        if(n ==0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        if(ways[n] != -1){
            return ways[n];
        }
        ways[n] = WaysCount(n-1, ways) + WaysCount(n-2, ways);

        return ways[n];
    }

    public static int CountWaysTab(int n){    //0(n)
        int ways[] = new int[n+1];
        ways[0] = 1;

        for(int i=1;i<=n;i++){
            if(i ==1){
                ways[i] = ways[i-1] + 0;
            }
            else{
                ways[i] = ways[i-1] + ways[i-2];
            }
        }
        return ways[n];
        
    }

    public static void main(String[] args) {
        int n=5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);

        System.out.println(WaysCount(n, ways));
        System.out.println(CountWaysTab(n));
    }
}
