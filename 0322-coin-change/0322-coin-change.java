class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
       
        if (amount == 0)  {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < coins.length;i++) {
            set.add(coins[i]);
        }
        for (int i = 0; i < amount + 1; i++) {
            
            if (set.contains(i)) {
                dp[i] = 1;
                
                continue;
            }
            dp[i] = Integer.MAX_VALUE - 1;
        }
        for (int i = 1; i < amount + 1; i++) {
            
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    
                    dp[i] = Math.min(dp[i-coins[j]] + 1, dp[i]);
                }
            }
            
        }
        System.out.println(Arrays.toString(dp));
        if (dp[amount] == 2147483646) {
            return -1;
        }
        else {
            return dp[amount];
        }
    }
}