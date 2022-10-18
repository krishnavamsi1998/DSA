//O(logn),O(1)

class Solution {
    //using binary search concept    
    public int searchInsert(int[] nums, int target) {
        
        int n=nums.length;
        int res=bs(nums,target,n);        
        return res;
        
    }
    
    public int bs(int[] nums, int target, int n)
    {
        int i=0;
        int j=n-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            
            if(nums[mid]==target)
                //found return pos
                return mid;
            else if(nums[mid]>target)
                j=mid-1;
            else
                i=mid+1;                
        }
        //insert position
        return j+1;
    }
}
