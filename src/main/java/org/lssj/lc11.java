package org.lssj;

// 11. 盛最多水的容器
public class lc11 {
    public int maxArea(int[] height) {
        if (height.length == 2) {
            return Math.min(height[0], height[1]);
        }

        int result = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(result, area);
            if (height[left] <= height[right])
                left++;
            else
                right--;
        }

        return result;
    }
}
