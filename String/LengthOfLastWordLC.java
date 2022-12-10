//O(k),O(1)

class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int i=n-1;
        int j=0;
        
        while(i>=0)
        {
            if(s.charAt(i)==' ')
            {   
                //dont continue after last word found           
                if(j!=0)
                    break;
                i--;
                continue;
            }
            j++;
            i--;            
        }        
        return j;
        
    }
}
