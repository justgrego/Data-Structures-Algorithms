class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int bin = Arrays.binarySearch(numbers, target - numbers[i]); 
            if (bin == i) bin += 1;
            if (bin > 0) {
                return new int[]{i + 1, bin + 1}; 
            }
        }
        return new int[]{-1,-1};
    }
}