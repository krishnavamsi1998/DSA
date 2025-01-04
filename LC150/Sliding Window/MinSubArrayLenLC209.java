//O(n),O(1)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int l,r,total;
        l=r=total=0;
        int res=nums.length+1;// res would not be more than this

        while(r<nums.length)
        {
            total+=nums[r];
            while(total>=target)
            {
                int len=r-l+1;
                res=Integer.min(res,len);
                total=total-nums[l];
                l++;
            }
            r++;
        }
        if(res==nums.length+1)// no su array found
            return 0;
        else
            return res;
        
    }
}
