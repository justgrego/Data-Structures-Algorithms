class Solution {
    public int rob(int[] nums) {
        
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int prev2 = nums[0];
        int prev1 = Math.max(nums[0], nums[1]);
        int max = prev1;
        for (int i = 2; i < nums.length; i++) {
            max = Math.max(prev2 + nums[i], max);
            max = Math.max(prev1, max);
            prev2 = prev1;
            prev1 = max;
            
        }
        return max;

    }
}