class Compute {
    
    public int findDuplicate(int A[])
    {
        // Your code goes here
        int n = A.length;
        int count=1;
      
        for(int i=0;i<n-1;i++){
            if(A[i]==A[i+1]){
                count++;
            }
            if(count==5){
                  int m = A[i];
                return m;
            }
        }
        return -1;
    }
}
