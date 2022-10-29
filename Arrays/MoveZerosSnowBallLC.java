//O(n),O(1)
//https://leetcode.com/problems/move-zeroes/discuss/172432/THE-EASIEST-but-UNUSUAL-snowball-JAVA-solution-BEATS-100-(O(n))-%2B-clear-explanation
class Solution {
    public void moveZeroes(int[] nums) {
        
        int snowBallSize=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                snowBallSize++;
            
            else if(snowBallSize>0)
            {
                //swap left most 0 with curr
                int t=nums[i];
                nums[i]=0;
                //left most 0;
                nums[i-snowBallSize]=t;
            }
                
        }
        
    }
}
