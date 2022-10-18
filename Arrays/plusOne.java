//O(n),O(n+1)

class Solution {
    public int[] plusOne(int[] digits) {
        
        int n=digits.length;
        
        //iterate from end
        for(int i=n-1;i>=0;i--)
        {
            //ex : 299
            //ex : 459
            //ex: 19999
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            
            digits[i]=0;
        }
        
        //if 999 i.e all 9's
        //form a new number
        int[] num=new int[n+1];
        num[0]=1; //1000
        return num;
        
    }
}
