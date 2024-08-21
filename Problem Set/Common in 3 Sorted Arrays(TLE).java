class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        int n = arr1.size();
        for(int i = 0;i<n;i++){
         for(int j =0;j<arr2.size();j++){
             if(arr1.get(i).equals(arr2.get(j))){
                 al.add(arr1.get(i));
             }
         }
    }
    for(int i =0;i<al.size();i++){
        for(int j=0;j<arr3.size();j++){
            if(al.get(i).equals(arr3.get(j))){
                al2.add(al.get(i));
            }
        }
    }
    
    LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
    for(int i:al2){
        hs.add(i);
    }
    List<Integer> al3 = new ArrayList<>(hs);
    
    if(al3.size()==0){
        al3.add(-1);
    }
        return al3;
    }
}
