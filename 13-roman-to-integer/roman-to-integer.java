class Solution {

    public int romanToInt(String s) {

        int number = 0;
        for (int currentIndex = 0; currentIndex < s.length(); currentIndex++) {
            int nextIndex = (currentIndex + 1 < s.length()) ? currentIndex + 1 : currentIndex;
            int currentValue = getValue(s.charAt(currentIndex));
            int nextValue = getValue(s.charAt(nextIndex));
            if (currentValue >= nextValue) {
                number += currentValue;
            } else if (currentValue < nextValue) {
                number -= currentValue;
            }
        }
        return number;

    }

    int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;

        }
        return c;

    }
}