class Solution {
    public int removeDuplicates(int[] nums) {
        int cur = nums[0] , place = 1, count = 1, i = 0, n = nums.length;
        for(i = 1; i < n ; i++){
            int num = nums[i];
            if(num == cur){
                count++;
                if(count < 3)
                    nums[place++] = num;
            }else{
                cur = num;
                count = 1;
                nums[place++] = num;
            }
        }
        return place;
    }
}
/*

[0,0,1,1,1,1,2,3,3]
[1,1,1,2,2,3]

*/