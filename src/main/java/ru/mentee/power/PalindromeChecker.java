package ru.mentee.power;

public class PalindromeChecker {

    public boolean isPalindrome(String s) {
        int len = s.length();
        int i = 0;
        int j = len - 1;
        s = s.toUpperCase();
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else if (!(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))))
                i++;
            else if (!(Character.isLetter(s.charAt(j)) || Character.isDigit(s.charAt(j))))
                j--;
            else return false;
        }
        return true;
    }

}
