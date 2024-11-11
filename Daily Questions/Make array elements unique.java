class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        int n = arr.length;
        Arrays.sort(arr);
        
        // HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        // for(int i: arr){
        //     hm.put(i, hm.getOrDefault(i, 0) + 1);
        // }
        // int increment = 0;
        // for(int i=0;i<n;i++){
        //     int current = arr[i];
        //     while(hm.get(current)>1){
        //         hm.put(current,hm.get(current)-1);
        //         current++;
        //         increment++;
        //         hm.put(current, hm.getOrDefault(current,0)+1);
        //     }
        // }
        // return increment;
        
        int increment=0;
        for(int i =1;i<n;i++){
            if(arr[i]<=arr[i-1]){
                int newVal = arr[i-1] + 1;
                increment += newVal - arr[i];
                arr[i] = newVal;
            }
        }
        return increment;
    }
}
