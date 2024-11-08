class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(!s.isEmpty()){
            al.add(s.pop());
        }
        Collections.sort(al);
        for(int i:al)
        {
            s.push(i);
        }
        return s;
    }
}
