class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
   String regex = "[,\\.\\s]";
   String[] myArray = S.split(regex);
   StringBuilder str = new StringBuilder();
   for(int i=myArray.length-1;i>=0;i--){
      str.append(myArray[i]);
      str.append(".");
   }
   String result = str.toString();
   if (result.endsWith(".")) {
    result = result.substring(0, result.length() - 1);
}

   return result;
    }
}
