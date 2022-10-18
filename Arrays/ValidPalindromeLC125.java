//O(n),O(n)

class Solution {
    public boolean isPalindrome(String s) {
        
        int n=s.length();
        //first convert to all lower case
        s=s.toLowerCase();
        
        StringBuilder sb=new StringBuilder();
        
        //now idenify only alhpa numeric chars
        
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)>=48 && s.charAt(i)<=57 || s.charAt(i)>=97 && s.charAt(i)<=122)
                sb.append(s.charAt(i));
            
        }
        
        //now check for palindrome
        n=sb.length();
        int i=0;
        int j=n-1;
        
        while(i<=j)
        {
            if(sb.charAt(i)!=sb.charAt(j))
                return false;
            i++;
            j--;
                
        }     
          
        return true;
        
    }
}
