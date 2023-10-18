class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        String filteredText = s.replaceAll("[^a-zA-Z0-9]", "");
        
        int len = filteredText.length() - 1; 
        for (int i = 0; i < filteredText.length() / 2; i++) {
            if (filteredText.charAt(i) == filteredText.charAt(len)) {
                len--;
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}