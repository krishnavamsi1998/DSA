/O(n),O(1)
class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> res=new ArrayList<>();
        
        int n=nums.length;
        int prev=0;
        int curr=0;        
        
        while(curr<n)
        {
            while(curr+1 <n && nums[curr]+1==nums[curr+1])
                curr=curr+1;
            
            if(prev!=curr)
            res.add(nums[prev]+"->"+nums[curr]);
            else
            res.add(""+nums[prev]);
            
            prev=curr+1;
            curr=curr+1;           
            
        }
        return res;
        
    }
}
