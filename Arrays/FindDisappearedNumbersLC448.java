//O(n),O(1)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        for(int n:nums)
        {
            //index
            int i=Math.abs(n)-1;
            // always tak abs since some values are already marked negative
            nums[i]=-1* Math.abs(nums[i]);

        }
        List<Integer> res=new ArrayList<>();

       for(int i=0;i<nums.length;i++)
       {
           //indexes which are not visited
           if(nums[i]>0)
           {
               // actual numbers which are disappeared since they are not visited
               res.add(i+1);
           }
       }

    return res;

    }
}
