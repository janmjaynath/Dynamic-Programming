import java.util.*;
public class MountainRanges {
    
    //0(n*2)
    public static int mountainranges(int n){
    int dp[] = new int[n+1];
    dp[0] = 1;
    dp[1] = 1;

    for(int i=2;i<n+1;i++){
        //ith pairs --> ci
        for(int j=0;j<i;j++){
        int insidepairs = dp[j];
        int outsidepairs = dp[i-j-1];
        dp[i] += insidepairs*outsidepairs;
    }
}
    
    return dp[n];
}

    public static void main(String[] args) {
        int n = 4;
        System.out.println(mountainranges(n));
    }
}
