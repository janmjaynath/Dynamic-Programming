import java.util.*;
public class TargetSumSubArray {
    
    //0(n*sum)
    
    public static boolean targetsum(int arr[],int sum){
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];
        // i =item & j = target sum
        for(int i=0;i<n+1;i++){
            dp[i][0] = true;
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                int u = arr[i-1];
                //include
                if(u <= j && dp[i-1][j-u] == true){
                    dp[i][j] = true;
                }
                //exclude
                else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = {4,2,7,1,3};
        int sum = 10;

        System.out.println(targetsum(arr,sum));
    }
}
