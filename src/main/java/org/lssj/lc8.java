package org.lssj;

// 8. 字符串转换整数
public class lc8 {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int result = 0;
        int pos = 0;
        int sign = 1;
        while (pos < s.length() && s.charAt(pos) == ' ') {
            pos++;
        }

        if (pos < s.length() && (s.charAt(pos) == '+' || s.charAt(pos) == '-')) {
            if (s.charAt(pos) == '-')
                sign = -1;
            pos++;
        }

        while (pos < s.length() && s.charAt(pos) == '0') {
            pos++;
        }

        while (pos < s.length() && s.charAt(pos) >= '0' && s.charAt(pos) <= '9') {
            int digit = s.charAt(pos) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + (s.charAt(pos) - '0');
            pos++;
        }

        return result * sign;
    }
}
