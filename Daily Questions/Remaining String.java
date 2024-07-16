class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder(""); 
        int cnt=0;
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]==ch){
                cnt++;
            }
            
                 if (cnt == count) {
                return s.substring(i + 1);
            }
        
      
    }
       return "";   
    }
}
