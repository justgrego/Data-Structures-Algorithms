class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i = 0;
        int count = 0;
        while(i < costs.length && coins >= 0) {
            if (coins - costs[i] >= 0)  {
                
                count++;
                coins-= costs[i];
                i++;
            }
            else {
                break;
            }
        }
        return count;
    }
}