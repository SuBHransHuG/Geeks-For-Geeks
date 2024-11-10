class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i :a){
          hs.add(i);  
        }
        for(int i : b){
            hs.add(i);
        }
        ArrayList<Integer> al = new ArrayList<Integer>(hs);
        Collections.sort(al);
        
        return al;
    }
}
