class Solution {
    public int climbStairs(int n) {
        int prev = 1;
        int curr = 2;
        if (n == 2) {
            return 2;
        }
        else if (n == 1) {
            return 1;
        }
        int next = 2;
        for (int i = 3; i <= n; i++) {
            int temp = next;
            next = prev + curr;
            prev = curr;
            curr = next;
            
        }
        return next;
    
    }

   
    
    

}