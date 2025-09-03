class Solution {
    public boolean isPowerOfTwo(int n) {
       
        // base case
        if (n == 1) return true;
        if (n <= 0 || n % 2 != 0) return false;
        
        // recursive step
        return isPowerOfTwo(n / 2);
    }
}
