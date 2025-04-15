package org.lssj;

// 12. 整数转罗马数字
public class lc12 {
    int[] numbers = {1, 4, 5, 9,
            10, 40, 50, 90,
            100, 400, 500, 900, 1000};

    String[] strs = {"I", "IV", "V", "IX",
            "X", "XL", "L", "XC",
            "C", "CD", "D", "CM", "M"};

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = numbers.length - 1; i >= 0 && num > 0; i--) {
            while (num >= numbers[i]) {
                result.append(strs[i]);
                num -= numbers[i];
            }
        }

        return result.toString();
    }
}
