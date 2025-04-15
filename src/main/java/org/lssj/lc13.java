package org.lssj;

// 13. 罗马数字转整数
public class lc13 {
    int[] numbers = {1, 4, 5, 9,
            10, 40, 50, 90,
            100, 400, 500, 900, 1000};

    String[] strs = {"I", "IV", "V", "IX",
            "X", "XL", "L", "XC",
            "C", "CD", "D", "CM", "M"};

    public int romanToInt(String s) {
        int result = 0;
        for (int i = numbers.length - 1; i >= 0 && s.length() > 0; i--) {
            while (s.length() > 0 && s.startsWith(strs[i])) {
                result += numbers[i];
                s = s.substring(strs[i].length());
            }
        }

        return result;
    }
}
