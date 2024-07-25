class Solution {
    public Node sortedArrayToBST(int[] nums) {
        // Code here
       if(nums==null || nums.length==0){
           return null;
       }
       return sortedArrayToBST(nums,0,nums.length-1);
    }
     private Node sortedArrayToBST(int[] nums,int start,int end) {
        // Code here
        int n = nums.length;
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node node = new Node(nums[mid]);
        node.left = sortedArrayToBST(nums,start,mid-1);
        node.right = sortedArrayToBST(nums,mid+1,end);
        return node;
    }
}
