//O(n),o(n)
//neetcode
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        
        int count=0;
        Set<Character> set=new HashSet<>();

        for(int r=0;r<s.length();r++)
        {
            while(set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            count=Math.max(count,r-l+1);

        }
        return count;

    }
}
