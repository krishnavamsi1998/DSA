//O(n),O(n)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int count=0;
        // sliding window
        int l=0;
        // set to maintain unique characters
        Set<Character> set=new HashSet<>();

        // r iterates
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
