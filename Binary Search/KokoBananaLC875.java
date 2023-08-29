//O(log(max(p))*p),O(1)

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //least eat 1 banana  
        int l=1;
        int r=max(piles);

        int res=r;

        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int hours=0;
            //cal how many hours will take
            for(int p:piles)
            {
                hours+=Math.ceil(p*1.0/mid);

            }
            if(hours>h)
            {
                 l=mid+1;
                
            }
            else
            {
               r=mid-1;
               res=mid;
            }


        }

        return res;


    }

    public int  max(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>max)
                max=i;
        }
        return max;
    } 
}
