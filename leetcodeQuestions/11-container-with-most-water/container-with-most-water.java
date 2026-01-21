class Solution {
    public int maxArea(int[] height) {
        int startIdx = 0, endIdx = height.length - 1;
        int maxArea = 0;
        while (startIdx < endIdx) {
            int currentArea = Math.min(height[startIdx], height[endIdx]) * (endIdx - startIdx);
            maxArea = (maxArea > currentArea) ? maxArea : currentArea;
            if (height[startIdx] < height[endIdx]) {
                startIdx++;
            } else {
                endIdx--;
            }
        }
        return maxArea;

    }
}