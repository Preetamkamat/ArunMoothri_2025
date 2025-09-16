package com.javapractice;

public class PalindromeDemo {
    public static void main(String[] args) {
  /*      String s = "madam";
        boolean isPalindrome = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(s + " is Palindrome: " + isPalindrome);
*/

        String s = "madam";
        boolean isPalindrome = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(s + " is palindrome" + isPalindrome);
    }
}
