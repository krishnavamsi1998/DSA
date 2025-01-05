//O(m+n),O(26)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] counter=new int[26]; // since we are ensure its all lower alphabets

        for(char c:magazine.toCharArray()) // count magzine letters       
            counter[c-'a']++;

        // check if that count is sufficient
        for(char c: ransomNote.toCharArray())
        {
            if(counter[c-'a']==0)// which means not sufficient
                return false;
            counter[c-'a']--; 
        }
        // if we reach here then all sufficient
        return true;
    }
}
