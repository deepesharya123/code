class Solution {
    public int countOdds(int low, int high) {
        int a = low;
        a/=2;
        int b = high+1;
        b/=2;
        return b-a;
    }
}