package org.leetcode.easy;

public class _14_LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strArr = new String[] {"flower","flow","flight"};
        String res = longestCommonPrefix(strArr);
        System.out.println("res : " + res);
    }

    public static String longestCommonPrefix(String[] strs) {

        for (int i = 0; i< strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++){
                if(i == strs[j].length() || strs[j].charAt(i) != ch)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

    /*
    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".



    Example 1:

    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.


    Constraints:

    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lowercase English letters if it is non-empty.
     */
}
