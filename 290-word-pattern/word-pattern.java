class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split("\\s+");

        if (pattern.length() != words.length)
            return false;

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch1 = pattern.charAt(i);
            String word = words[i];
            if (map.containsKey(ch1)) {
                if (!map.get(ch1).equals(word))
                    return false;
            } else {
                if (map.containsValue(word))
                    return false;
                map.put(ch1, word);
            }
        }
        return true;

    }
}