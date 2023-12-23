//O(nlogn+n2),O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            
            int l=i+1;
            int r=n-1;

            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];

                if(sum <0)
                    l++;
                else if(sum>0)
                    r--;
                else
                    {
                        List<Integer> res1=new ArrayList<>();
                        res1.add(nums[i]);
                        res1.add(nums[l]);
                        res1.add(nums[r]);
                        res.add(res1);
                        l++;
                        //avoid duplicate
                        while(l<r && nums[l]==nums[l-1])
                        {
                            l++;
                        }

                    }
            }

        }

        return res;
        
    }
}
