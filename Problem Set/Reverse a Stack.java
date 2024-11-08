class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        ArrayList<Integer> st = new ArrayList<Integer>();
        while(!s.isEmpty()){
            st.add(s.pop());
        }
        // Collections.reverse(st);
        for(int i : st){
            s.push(i);
        }
        
    }
}
