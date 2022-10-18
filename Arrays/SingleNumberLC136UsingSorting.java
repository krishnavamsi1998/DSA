//O(nlogn),O(1)

class Solution {
    public int singleNumber(int[] nums) {
        
        if(nums.length==1)
            return nums[0];
        //first sort it 
        Arrays.sort(nums);
        
        for(int i:nums)
            System.out.print(i+" ");
        
        int n=nums.length;
        int ans=0;
        //evry element appears twice , so after 
        //visiting one , skip the next pos
        for(int i=0;i<n-1;i+=2)
        {
            if(nums[i]!=nums[i+1]){
                ans=nums[i];
                break;
            }
        }
        
        //suppose if that single ele is at last
        if(nums[n-2]!=nums[n-1])
            ans=nums[n-1];       
        
        
        return ans;
        
    }
}
