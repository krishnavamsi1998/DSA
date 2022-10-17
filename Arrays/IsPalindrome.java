class Solution {
    public boolean isPalindrome(int x) {
        
        int temp=x;
        int revSum=0;
        
        //checking negative
        if(x<0)
            return false;
        
        while(temp!=0)
        {
            int rem=temp%10;
            revSum=revSum*10+rem;
            temp=temp/10;           
            
        }
        
        if(revSum==x)
            return true;
        else
            return false;
        
    }
}
