class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        int max =0 ;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
          
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        int[] dp = new int[map.size()];
        int count = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            dp[count++] = e.getValue();
        }
        
        Arrays.sort(dp);
        int numRemoved = 0;
        for (int i = 0; i < dp.length; i++) {
            if (k - dp[i] >= 0 && dp[i] > 0) {
                System.out.println("here");
                numRemoved++;
                k -= dp[i];
            }
            else if (dp[i] == 0) {
                continue;
                
            }
            else {
                break;
            }
        }
        
       
        
        System.out.println(Arrays.toString(dp));
        return map.size() - numRemoved;
    }
}