package org.lssj;


// 9. 回文数
public class lc9 {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x == 0)
            return true;

        int nx = 0, n = x;
        while (n > 0) {
            nx = nx * 10 + n % 10;
            n /= 10;
        }
        return nx == x;
    }
}
