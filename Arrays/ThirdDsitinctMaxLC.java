//O(n),O(2n)

class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new TreeSet<>();        
        
        for(int num:nums)
            set.add(num);
        
        //convert to Arraylist
        List<Integer> list=new ArrayList<>(set);
        
        int n=list.size();
        
        if(n<3)
            return list.get(n-1);
        else
            return list.get(n-3);       
                    
    }
}
