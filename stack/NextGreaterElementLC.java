//O(n),O(n+n)
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer,Integer> map=new HashMap();
        Stack<Integer> stack=new Stack();        
        
        //iterate nums2 and put next greater ele of each ele in map
        
        for(Integer num:nums2)
        {
            while(!stack.isEmpty() && stack.peek()<num)
            {
                int nextGreaterElement=num;
                map.put(stack.pop(),nextGreaterElement);
            }
            stack.push(num);
        }
        
        //iterate num1 and replace it with nextGreaterElement
        
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=map.getOrDefault(nums1[i],-1);
        }
        
        return nums1;
    }
}
