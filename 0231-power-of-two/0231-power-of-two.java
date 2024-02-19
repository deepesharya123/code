class Solution {
    public boolean isPowerOfTwo(int n) {
        if( n <= 0 )
            return false;
        return ((long)(n & (n-1))) == 0; 
    }
}