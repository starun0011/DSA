class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int maxLength = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            boolean samePrefix = true;
            for (String s : strs) {
                if (s.length() > i && s.charAt(i) == strs[0].charAt(i)) {
                    samePrefix = true;
                } else {
                    samePrefix = false;
                    break;
                }

            }
            if (samePrefix) {
                maxLength = maxLength + 1;
            } else {
                break;
            }
        }

        return strs[0].substring(0, maxLength);

    }
}