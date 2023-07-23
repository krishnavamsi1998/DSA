//O(nlogn),O(n)
class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        //declare string array
        String[] s=new String[n];

        for(int i=0;i<n;i++)
            s[i]=String.valueOf(nums[i]);

        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));

        //[0,0]
        //res=0
        if(s[0].equals("0"))
        return "0";
        else
        return String.join("",s);

    }
}
