class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while(start <= end) {
            
            if (height[start] < height[end]) {
                
                max = Math.max((end - start) * Math.min(height[start], height[end]), max);
                start++;
                
            }
            else if (height[end] < height[start]) {
                max = Math.max((end - start) * Math.min(height[start], height[end]), max);
                end--;
                
            }
            else {
                max = Math.max((end - start) * Math.min(height[start], height[end]), max);
                end--;
            }
        }
        return max;
    }
}