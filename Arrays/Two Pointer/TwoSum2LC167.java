//O(n),O(1)

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int l=0;
        int r=numbers.length-1;

        while(l<r)
        {
            int sum=numbers[l]+numbers[r];

            if(sum == target)
                return new int[]{l+1,r+1};
            else if(sum > target)
                r--;
            else
                l++;
            
        }
    //anything you can return since a solution is guranteed
        return new int[]{0,0};
    }
}
