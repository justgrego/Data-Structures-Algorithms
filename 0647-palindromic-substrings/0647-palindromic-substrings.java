class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += expandCheck(i, i, s);
            ans += expandCheck(i, i+1, s);
        }
        return ans;
    }
    public int expandCheck(int i , int j , String s) {
        int count = 0;
        int mid = i;
        int mid2 = j;
        while (mid >= 0 && mid2 < s.length() && s.charAt(mid) == s.charAt(mid2)) {
            mid--;
            mid2++;
            count++;
        }
        return count;
    }
}