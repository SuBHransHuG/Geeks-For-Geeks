class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node == null){
        return 0;
        }
        int lh = height(node.left);
        int rh = height(node.right);
        return 1+Math.max(lh,rh);
    }
}
