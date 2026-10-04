class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> used = new HashMap<>();

        String[] words = s.split("\\s+");

        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (used.containsKey(word)) {
                    return false;
                }

                map.put(c, word);
                used.put(word, c);
            }
        }

        return true;
    }
}
