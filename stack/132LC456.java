//O(n),O(n)
//neetcode
class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        int min=nums[0];

        Stack<int[]> st=new Stack<>();
        for(int i=1;i<n;i++)
        {
            while(!st.isEmpty() && nums[i]>=st.peek()[0])            
                st.pop();
            
            if(!st.isEmpty() && nums[i]>st.peek()[1])
                return true;

            min=Integer.min(min,nums[i]);
            st.push(new int[]{nums[i],min});
        }
        return false;
    }
}
