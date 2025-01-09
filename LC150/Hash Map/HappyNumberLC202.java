//O(logn),O(logn)
class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set=new HashSet<>();

        while(set.add(n))
        {
            int sum=0;
            while(n>0){
                int r=n%10;
                sum+= r*r;
                n/=10;
            }

            if(sum==1)
                return true;
            else
                n=sum;
        }

        return false;
    }
}
