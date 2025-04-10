package org.lssj;

// 7. 整数反转
public class lc7 {

    public int reverse(int x) {
        int answer = 0, sign = 1;
        if (x < 0) {
            sign = -1;
            x = -x;
        }

        while (x != 0) {
            int digit = x % 10;
            if (answer > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            answer = answer * 10 + digit;
            x /= 10;
        }
        return answer * sign;
    }
}
