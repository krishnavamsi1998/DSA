//O(n),O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k=1;
        
        for(int i=0;i<nums.length-1;i++)
        {
            int first=nums[i];
            int second=nums[i+1];
            
            //when different then place that adjacent , if same continue
            
            if(first!=second)            
                nums[k++]=second;
            
        }
        
        return k;
    }
}
