//O(n),O(1)
//kadane's algo
//cs dojo

class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum,global_sum;
        curr_sum=global_sum=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>curr_sum+nums[i])
                curr_sum=nums[i];
            else
                curr_sum=curr_sum+nums[i];
            global_sum= curr_sum >global_sum ? curr_sum : global_sum;
        }

        return global_sum;

       
    }
}
