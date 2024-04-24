class Solution
{
    static int mod = 1000000007;
    static int help(int x,int y,int dp[][]){
        if(x==0 && y==0)return 1;
        if(x<0 || y<0)return 0;
        if(dp[x][y]!=-1)return dp[x][y];
        int a = help(x-1,y,dp);
        int b = help(x,y-1,dp);
        return dp[x][y] = (a+b)%mod;
    }
    public static int ways(int n, int m)
    {
        // complete the function
        int dp[][] = new int[n+1][m+1];
        for(int temp[]:dp)Arrays.fill(temp,-1);
        return help(n,m,dp);
    }
    
}
