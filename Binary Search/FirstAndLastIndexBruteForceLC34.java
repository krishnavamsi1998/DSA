//O(n),O(1)

class Solution {
    public int[] searchRange(int[] nums, int target) {

      int[] res=new int[2];
        res[0]=-1;
        res[1]=-1;
        boolean firstIndexFilled=false;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target && !firstIndexFilled)
                {
                    firstIndexFilled=true;
                    res[0]=i;
                }
                else if(nums[i]==target && firstIndexFilled)
                {
                    res[1]=i;
                }       

                
        }

        // for [1], target =1 , op : [0,0]
        if(res[0]!=-1 && res[1]==-1)
            res[1]=res[0];

        return res;



    }
}
