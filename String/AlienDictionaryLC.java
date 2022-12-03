//O(n*k),O(1) , k=length of longest word
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        int n=words.length;
        for(int i=0;i<n-1;i++)
        {
            String s1=words[i];
            String s2=words[i+1];
            
            int len=Math.min(s1.length(),s2.length());
            int j;
            for(j=0;j<len;j++)
            {
                char c1=s1.charAt(j);
                char c2=s2.charAt(j);
                
                
                if(c1!=c2){
                    if(order.indexOf(c1) > order.indexOf(c2))
                        return false;
                    break;
                }
            }
            if(j==len && s1.length()>s2.length())
                return false;
        }
        return true;
        
    }
}
