//O(nlogn),O(1)
//neetcode
class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int l=0;
        int r=people.length-1;
       

        int boats=0;

        while(l<=r)
        {
            if(people[l]+people[r]<=limit)
            {
                boats+=1;
                l++;
                r--;

            }
            else
            {
                //boat only carries right
                boats+=1;
                r--;                
            }
        }

        return boats;

    }
}
