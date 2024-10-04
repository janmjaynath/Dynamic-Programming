import java.util.*;
public class RodCutting {
    
    //wt = length & val = prices & w = totrod
    public static int rodcut(int length[],int prices[],int totrod){
        int n = length.length;
        int dp[][] = new int[n+1][totrod+1];

        for(int i=0;i<n+1;i++){
           for(int j=0;j<totrod+1;j++){
            if(i == 0 || j == 0){
                dp[i][j] = 0;
            }
           }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<totrod+1;j++){
                if(length[i-1] <= j){
                    //valid
                    dp[i][j] = Math.max(prices[i-1] + dp[i][j-length[i-1]] , dp[i-1][j]);
                }
                //invalid
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][totrod];
    }
    public static void main(String[] args) {
        int length[] = {1,2,3,4,5,6,7,8};
        int prices[] = {1,5,8,9,10,17,17,20};
        int totrod = 8;

        System.out.println(rodcut(length, prices, totrod));
    }
}
