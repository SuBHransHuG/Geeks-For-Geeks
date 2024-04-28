class Solution {
  public:
    int binary_to_decimal(string str) {
        // Code here.
        long long n =0;
        for (char c : str) {
        if (c >= '0' && c <= '9') {
            n = n * 10 + (c - '0');
        }
    }

    long long num = n;
        long long dec_value = 0;
 
        long long base = 1;
 
        long long temp = num;
        while (temp > 0) {
            long long last_digit = temp % 10;
            temp = temp / 10;
            dec_value += last_digit * base;
            base = base * 2;
        }
 
        return dec_value;
    }
};
