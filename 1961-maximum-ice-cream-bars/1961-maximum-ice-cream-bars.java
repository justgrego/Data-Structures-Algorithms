class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count = 0;
        int[] arr = new int[100001];
        for (int i = 0; i < costs.length; i++) {
            arr[costs[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (coins >= 0 && arr[i] >0) {
                while(coins - i >= 0 && arr[i] > 0) {
                    coins -= i;
                    arr[i]--;
                    count++;
                }
            }
        }
        return count;
    }
}