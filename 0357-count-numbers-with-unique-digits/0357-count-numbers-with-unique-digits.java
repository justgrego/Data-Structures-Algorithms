class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        
        if (n == 0) return 1;
        if (n == 1) return 10;
        int prev = 1;
        int curr = 10;
        int count = 0;
        for (int i = 9; i >= 11 - n; i--) {
           
            int mult = 9;
            for (int j = 9; j >= 9 - count; j--) {
                
                mult *= j;
            }
            count++;
            curr += mult;
        }

        return curr;
    }
}