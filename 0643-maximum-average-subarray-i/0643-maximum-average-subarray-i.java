class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double curr = 0;
        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }
        double avg = curr / k;
        double max = avg;

        for (int i = k; i < nums.length; i++) {
            curr += nums[i];
            curr -= nums[i - k];
            avg = curr/k;
            max = Math.max(avg, max);
        }
        return max;
    }
}