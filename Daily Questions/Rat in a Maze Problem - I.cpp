class Solution {
  public:
  bool isSafe(int newX,int newY,vector<vector<bool>> &visted,vector<vector<int>> &mat,int n){
      if(newX>=0 && newX<n && newY>=0 && newY<n && !visted[newX][newY] && mat[newX][newY]==1){
          return true;
      }
      else{
          return false;
      }
  } 
  
  void solve(int x,int y,vector<vector<int>> &mat,int n,vector<string> &ans,vector<vector<bool>> &visted,string path){
      if(x==n-1 && y==n-1){
          ans.push_back(path);
          return;
      }
      visted[x][y] = true;
    //   down
      if(isSafe(x+1,y,visted,mat,n)){
          solve(x+1,y,mat,n,ans,visted,path+'D');
      }
    //   left
      if(isSafe(x,y-1,visted,mat,n)){
          solve(x,y-1,mat,n,ans,visted,path+'L');
        //   Right
      }if(isSafe(x,y+1,visted,mat,n)){
          solve(x,y+1,mat,n,ans,visted,path+'R');
        //   Upper
      }if(isSafe(x-1,y,visted,mat,n)){
          solve(x-1,y,mat,n,ans,visted,path+'U');
      }
      visted[x][y]=false;
  }
  
  
  
    vector<string> findPath(vector<vector<int>> &mat) {
        // Your code goes here
        int n = mat.size();
        vector<string> ans;
        vector<vector<bool>> visted(n,vector<bool>(n,false));
        string path="";
        
        if(mat[0][0]==0){
            return ans;
        }
        solve(0,0,mat,n,ans,visted,path);
        return ans;
    }
};
