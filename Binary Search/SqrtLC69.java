//O(logn),O(1)

class Solution {
    public int mySqrt(int x) {
        
        int l=0;
        int h=x;

        while(l<=h)
        {
            long mid=l+(h-l)/2;

            if(mid*mid==x)
                return (int)mid;
            else if(mid*mid > x)
                h=(int)mid-1;
            else 
                l=(int)mid+1;

        }

        return h;

    }
}
