//O(n),O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // declare a hash map
        Map<Integer,Integer> map=new HashMap<>();
        int[] res=new int[2];

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(target-nums[i]))
            {
                    map.put(nums[i],i);
            }
            else
            {                   
                    res[0]=i;
                    res[1]=map.get(target-nums[i]);
                    break;
            }
        }
    return res;

    }
}
