package org.leetcode.easy;

public class _9_PalindromeNumber {

    public static void main(String[] args) {
        int num = 13431;
        boolean isP = isPalindrome(num);
        System.out.println("isPalindrome : " + isP);
    }

    public static boolean isPalindrome(int n) {
        if(n < 0)
            return false;
        String num = n + "";
        char[] arr = num.toCharArray();
        for(int i = 0; i< arr.length / 2; i++){
            if(arr[i] != arr[arr.length - i - 1])
                return false;
        }
        return true;
    }


    /*
    Given an integer x, return true if x is a palindrome, and false otherwise.



    Example 1:

    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
    Example 2:

    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    Example 3:

    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     */
}
