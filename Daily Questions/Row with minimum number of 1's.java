class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int ans=-1,mn=Integer.MAX_VALUE,one=0;
        for(int i=0;i<n;i++){
            one=0;
            for(int j=0;j<m;j++){
                if(a[i][j]==1)one++;
            }
            if(one<mn){
                mn=one;
                ans=i+1;
            }
        }
        return ans;
    }
};
