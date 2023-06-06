class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i = 1; i < arr.length -1; i++){
            int curr = arr[i], prev = arr[i-1] , next = arr[i+1];
            if( curr - prev != next-curr)
                return false;
        }
        return true;
    }
}