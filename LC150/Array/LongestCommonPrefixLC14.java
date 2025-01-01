//O(n*m),O(1)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";

        // iterate evry char of first string and compare with other strings

        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs) {// out of bounds or char not equal then return
                if (i == s.length() || strs[0].charAt(i) != s.charAt(i))
                    return res;
            }
            res = res + strs[0].charAt(i); // adding common char
        }

        return res;
    }
}
