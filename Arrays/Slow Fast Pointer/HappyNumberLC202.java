//O(logn)|O(1),O(1)
//slow fast pointer approach
class Solution {
    public boolean isHappy(int n) {
        
        int slow=n;
        int fast=n;
        
        do{
            
           slow=sum(slow);
           fast=sum(sum(fast));
            
            if(slow==1)
                return true;          
            
            
        }while(fast!=slow);
        
        //equal -> cycle
        return false;
        
    }
    //sum of squares of its digits
    
    public int sum(int n)
    {
        int s=0;
        
        while(n!=0)
        {
            int rem=n%10;
            s=s+(rem*rem);
            n=n/10;
            
        }
        return s;
    }
}
