class Solution {
    public boolean canBeValid(String s, String locked) {
        int length = s.length();
        if (length % 2 != 0) return false;
        int min = 0, max= 0;
        for (int i = 0; i < length; i++) {
            boolean isOpening = s.charAt(i) == '(';
            boolean isUnlocked = locked.charAt(i) == '0';
            min += (!isOpening || isUnlocked) ? -1 : 1;
            max += (isOpening || isUnlocked) ? 1 : -1;
            if (max < 0) return false;
            min = Math.max(min, 0);
        }
        return min == 0;
    }
}