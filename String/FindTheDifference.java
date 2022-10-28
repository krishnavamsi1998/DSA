//O(n),O(1)

class Solution {
    public char findTheDifference(String s, String t) {
        
        int[] arr=new int[26];
        
        for(char ch:s.toCharArray())
            arr[ch-'a']--;
        
        for(char ch:t.toCharArray())
            arr[ch-'a']++;
        
        int i=0;
        
        for(;i<26;i++)
            if(arr[i]==1)
                break;            
        
        return (char)(i+'a');
    }
}
