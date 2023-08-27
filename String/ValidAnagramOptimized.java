//O(n),O(1)
class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        
        int[] ascii=new int[26];

        if(n1!=n2)
            return false;

        for(int i=0;i<n1;i++)
        {
            ascii[s.charAt(i)-'a']++;
            ascii[t.charAt(i)-'a']--;
        }

        for(int i:ascii)
            if(i!=0)
                return false;
        return true;
    }
}
