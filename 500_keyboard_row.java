class Solution {
    public String[] findWords(String[] words) {
        int[] rowMap = new int[26];
        
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        for (char c : row1.toCharArray()) rowMap[c - 'a'] = 1;
        for (char c : row2.toCharArray()) rowMap[c - 'a'] = 2;
        for (char c : row3.toCharArray()) rowMap[c - 'a'] = 3;
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            
            int targetRow = rowMap[Character.toLowerCase(word.charAt(0)) - 'a'];
            boolean isValid = true;
            
            for (int i = 1; i < word.length(); i++) {
                int currentRow = rowMap[Character.toLowerCase(word.charAt(i)) - 'a'];
                if (currentRow != targetRow) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
}
