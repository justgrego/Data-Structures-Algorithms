class Solution {
    public int maxProduct(int[] nums) {
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        if (nums.length == 1) return nums[0];
        dp1[0] = nums[0];
        dp2[0] = nums[0];
        int max = dp1[0];
        for (int i = 1; i < nums.length; i++) {
            dp1[i] = Math.max(nums[i], Math.max(
                nums[i] * dp1[i - 1], nums[i] * dp2[i - 1]));
            dp2[i] = Math.min(nums[i], Math.min(
                nums[i] * dp1[i - 1], nums[i] * dp2[i - 1]));
            max = Math.max(max, dp1[i]);
        }
        return max;
    }
}