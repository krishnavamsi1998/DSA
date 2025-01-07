//O(n),O(1)
class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] res=new int[26];

        if(s.length()!=t.length())
            return false;

        for(int i=0;i<s.length();i++)
        {
            res[s.charAt(i)-97]++;
            res[t.charAt(i)-97]--;
        }        

        for(int i=0;i<26;i++)
        {
            if(res[i]!=0)
                return false;
        }
        return true;
    }
}
