//Boye's Moore voting algo

//O(n),O(1)
//intui : give that maj ele exits and occurs n/2 , so all other ele even if combined 
//cannot cancel the frequency of majority ele , or take the count to 0

class Solution {
    public int majorityElement(int[] nums) {
        
        int n=nums.length;
        int maj=nums[0];
        int c=1;
        
        for(int i=1;i<n;i++)
        {
            if(c==0)
            {
                maj=nums[i];
                c++;
                
            }
            else if(maj==nums[i])
                c++;
            else if(maj!=nums[i])
                c--;
            
        }
        return maj;
        
    }
}
