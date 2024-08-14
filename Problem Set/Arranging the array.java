class Solution {
    
    public void Rearrange(int a[], int n)
    {
        // Your code goes here
        ArrayList<Integer> al1 = new ArrayList<>(); //positive
        ArrayList<Integer> al2 = new ArrayList<>(); //Negative
        for(int i=0;i<n;i++){
            if(a[i]<0){
                al2.add(a[i]);
            }
            else{
                al1.add(a[i]);
            }
        }
        for(int i=0;i<al2.size();i++){
            a[i] = al2.get(i);
        }
        int t = al2.size();
        for(int i = 0;i<al1.size();i++){
            a[t] = al1.get(i);
            t++;
            if(t>n){
                break;
            }
        }
    }
