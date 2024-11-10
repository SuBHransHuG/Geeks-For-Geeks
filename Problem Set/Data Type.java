class Solution {
    static int dataTypeSize(String str) {
        // code here
        if(str.equals("Character")){
            return 1;
        }
        else if(str.equals("Float") || str.equals("Integer")){
            return 4;
        }
        else{
            return 8;
        }
    }
}
