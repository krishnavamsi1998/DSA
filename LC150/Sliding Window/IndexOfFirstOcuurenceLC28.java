//O(n),O(1)
class Solution {
    public int strStr(String haystack, String needle) {
        int i = needle.length();
        int n = haystack.length();
        int j = 0;

        while (j < n) {
            if (j + i <= n && haystack.substring(j, j + i).equals(needle)) {
                return j;
            }
            j++;
        }
        return -1;

    }
}
