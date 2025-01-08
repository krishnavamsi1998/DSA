//O(n),O(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] res=new int[2];

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int number=target-nums[i];
            if(map.containsKey(number))
            {
                res[0]=map.get(number);
                res[1]=i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
