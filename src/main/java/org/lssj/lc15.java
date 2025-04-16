package org.lssj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 15. 三数之和
public class lc15 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int r = nums[i] + nums[left] + nums[right];
                if (r == 0) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    while (left + 1 < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right - 1 && nums[right - 1] == nums[right]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (r < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
