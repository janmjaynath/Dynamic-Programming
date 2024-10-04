import java.util.*;
public class LargestCommonSubsequence {
    
    //0(n*m)
    public static int lcs(String str1,String str2 ,int n,int m){
        
        if(n == 0 || m == 0){
            return 0;
        }
        //same
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return lcs(str1, str2, n-1, m-1) + 1;
        }
        //diff
        else{
            int ans1 = lcs(str1, str2, n-1, m);
            int ans2 = lcs(str1, str2, n, m-1);
            return Math.max(ans1, ans2);
            
        }
    }

    
    //Tabulation
    //0(n*m)
    public static int lcsTab(String str1,String str2){
        
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
            }
        }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                   
                }
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);

                }
        }
    }  
       int del = str1.length()-dp[n][m];
       int add = str2.length()-dp[n][m];

       System.out.println("del is ="+ del);
       System.out.println("add is = " + add);

       return del+add;
}

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";

        System.out.println(lcsTab(str1, str2));
    }
}
