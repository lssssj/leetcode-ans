package org.lssj;

import java.util.HashMap;
import java.util.Map;

// 3. 无重复字符的最长子串
public class lc3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int maxLen = 0, start = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                start = Math.max(start, map.get(s.charAt(i)) + 1);
            }
            maxLen = Math.max(maxLen, i - start + 1);
            map.put(s.charAt(i), i);
        }

        return maxLen;
    }
}
