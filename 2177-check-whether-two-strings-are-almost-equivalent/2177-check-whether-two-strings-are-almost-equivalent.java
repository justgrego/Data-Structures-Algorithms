class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int counter = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            if (map.containsKey(word1.charAt(i))) {
                map.put(word1.charAt(i), map.get(word1.charAt(i)) + 1);
            }
            else {
                map.put(word1.charAt(i), 1);
            }

            if (map2.containsKey(word2.charAt(i))) {
                map2.put(word2.charAt(i), map2.get(word2.charAt(i)) + 1);
            }
            else {
                map2.put(word2.charAt(i), 1);
            }
        }
        int max = 0;
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (map2.containsKey(e.getKey())) {
                max = Math.max(max, Math.abs(e.getValue() - map2.get(e.getKey())));
            }
            else {
                max = Math.max(max, e.getValue());
                
            }
        }

        for (Map.Entry<Character, Integer> e : map2.entrySet()) {
            if (map.containsKey(e.getKey())) {
                max = Math.max(max, Math.abs(e.getValue() - map.get(e.getKey())));
            }
            else {
       
                max = Math.max(max, e.getValue());
                
            }
        }
       
        return max <= 3;
    }
}