class Solution {
    public int longestCommonSubstr(String str1, String str2) {
        // code here
        int length = 0;
        for(int i=0;i<str1.length();i++){
            for(int j=i+1;j<=str1.length();j++){
                String m = str1.substring(i,j);
                if(str2.contains(m)){
                    length = Math.max(length,m.length());
                }
            }
        }
        return length;
    }
}
