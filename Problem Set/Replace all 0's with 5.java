class GfG {
    int convertfive(int num) {
        String temp = Integer.toString(num);
int[] arr = new int[temp.length()];
for (int i = 0; i < temp.length(); i++)
{
    arr[i] = temp.charAt(i) - '0';
}
for(int i=0;i<arr.length;i++){
    if(arr[i]==0){
        arr[i] = 5;
    }
}
int res=0;
    for(int i=0;i<arr.length;i++) {
         res=res*10+arr[i];
    }
      return res;  // Your code here
    }
}
