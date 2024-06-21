class Solution
{
    public static void sort012(int a[], int n)
    {
        int i = 0;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
         while ( i < n )  
    {  
        if ( a[i] == 0 )  
        {  
            count0 = count0 + 1 ;  
        }  
        else if ( a[i] == 1 )  
        {  
            count1 = count1 + 1 ;  
        }  
       else if(a[i] == 2)
        {
            count2+=1;
        }
        i++;
    }
    
     i=0;
    while(count0>0)
    {
        a[i] = 0;
        i+=1;
        count0--;
    }
    
    while(count1>0)
    {
        a[i] = 1;
        i+=1;
        count1--;
    }
    
    while(count2>0)
    {
        a[i] = 2;
        i+=1;
        count2--;
    }
}
}
