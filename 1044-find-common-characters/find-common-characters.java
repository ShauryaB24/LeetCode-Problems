class Solution {
    public List<String> commonChars(String[] words) {
        int[] commonFreq = new int[26];
        for (char c : words[0].toCharArray()) {
            commonFreq[c - 'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] currentFreq = new int[26];
            for (char c : words[i].toCharArray()) {
                currentFreq[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                commonFreq[j] = Math.min(commonFreq[j], currentFreq[j]);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (commonFreq[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                commonFreq[i]--;
            }
        }
        return result;
    }
}