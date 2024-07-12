class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        char[] arr = a.toCharArray();
        char[] arr1 = b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(Arrays.equals(arr,arr1)){
            return true;
        }
        return false;
    }
}
