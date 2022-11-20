//?,?
class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        int n=nums.length;
        int i=0;
        
        while(check(original,nums))
        {
            original=original*2;
        }
         return original;   
    }
    public boolean check(int original,int[] nums)
    {
        for(int i:nums)
            if(i==original)
                return true;
        return false;
    }
}
