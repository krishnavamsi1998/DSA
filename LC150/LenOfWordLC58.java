//O(n),O(1)
class Solution {
    public int lengthOfLastWord(String s) {

        // stop i after trailing space
        int i = s.length() - 1;
        int len = 0;
        while (s.charAt(i) == ' ') {
            i--;
        }

        // now i points to first char of the last word
        // calcualte len of word
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;

    }
}
