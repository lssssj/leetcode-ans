package org.lssj;

// 5. 最长回文子串
public class lc5 {
    private int len;
    private String str;

    public String longestPalindrome(String s) {
        len = 0;
        for (int i = 0; i < s.length(); i++) {
            isPalindrome(s, i, i);
            isPalindrome(s, i, i + 1);
        }
        return str;
    }

    private void isPalindrome(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        i++; j--;
        if (j - i + 1 > len) {
            len = j - i + 1;
            str = s.substring(i, j + 1);
        }
    }
}
