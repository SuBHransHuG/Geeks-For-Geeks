class Solution
{
    ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        
        for(int i =0;i<n;i++){
            if(!hashSet.contains(arr[i]))
            hashSet.add(arr[i]);
        }
        ArrayList<Integer> aL = new ArrayList<>(hashSet);
        return aL;
    }
}
