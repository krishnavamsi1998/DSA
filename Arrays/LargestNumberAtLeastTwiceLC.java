//O(n),O(1)

class Solution {
    public int dominantIndex(int[] nums) {
        
        int n=nums.length;
        
        //first find the largest number
        int max=0;
        int ind=0;
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=max)
            {
                max=nums[i];
                ind=i;
            }
            
        }        
        //check if this number is twice as big as other number
        
        for(int i=0;i<n;i++)
        {
            if(i!=ind)
            {
                if(nums[i]*2>max)
                    return -1;
            }
        }
        return ind;
            
    }
}
