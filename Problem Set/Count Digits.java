class Solution{
    static int evenlyDivides(int N) {
    ArrayList<Integer> hs = new ArrayList<>();
    String s = String.valueOf(N); 
    char[] arr = s.toCharArray();  
    
    for (int i = 0; i < arr.length; i++) {
        hs.add(arr[i] - '0');  
    }
    
    int count = 0;
    for (int digit : hs) {
        if (digit != 0 && N % digit == 0) {  
            count++;
        }
    }
    
    return count;
}
