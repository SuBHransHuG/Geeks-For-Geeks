class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
    int binary = 0;

        binary = n;
        for (int bit = 1; n > 0; bit <<= 1) {
            n >>= 1;
            binary ^= n;
        }

        return binary;
}

       
}
