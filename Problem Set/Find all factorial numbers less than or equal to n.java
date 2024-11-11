class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> al = new ArrayList<Long>();
        long fact =1;
        long i =1;
        while(fact<=n){
            al.add(fact);
            
            i++;
            fact*=i;
        
        }
        return al;
    }
}
