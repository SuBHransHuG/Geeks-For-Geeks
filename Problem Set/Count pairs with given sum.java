class Solution {
    int getPairsCount(int[] arr, int sum) {
        int n = arr.length;
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            int com = sum - arr[i];
            if(hm.containsKey(com)){
             count+= hm.get(com);   
            }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}
