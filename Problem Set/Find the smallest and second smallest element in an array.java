class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
     TreeSet<Long> ts1 = new TreeSet<Long>(); 
     for(long i:a){
         ts1.add(i);
     }
     Long[] arr = ts1.toArray(new Long[ts1.size()]);
     if(arr.length !=1){
     return new long[]{arr[0],arr[1]};
     }
     return new long[]{-1};
    }
}
