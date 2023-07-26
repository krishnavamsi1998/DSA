//this is using O(n) space , O(1) possible ?
class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set=new HashSet<>();

        while(set.add(n))
        {
            n=sumOfSquares(n);

            if(n==1)
            return true;

        }

        return false;

    }

    public int sumOfSquares(int n)
    {
        int s=0;
        while(n!=0)
        {
            int r=n%10;
            s=s+(r*r);
            n=n/10;
        }
    return s;
    }
}
