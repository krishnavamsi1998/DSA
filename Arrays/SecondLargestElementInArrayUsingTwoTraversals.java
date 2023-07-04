//O(2n),O(1)
class Solution {
    int print2largest(int arr[], int n) {
        //first get the first largest..
        // assume least integer as maximum element initially
        int max=Integer.MIN_VALUE;
        // iterate over array elements
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                
            }
        }
        
        int smax=Integer.MIN_VALUE;
        // iterate again to find the second largest
        for(int i=0;i<n;i++)
        {
            if(arr[i]>smax && arr[i]!=max)
                smax=arr[i];
        }
        
        if(max==smax || smax==Integer.MIN_VALUE)
        //there is no second largest
        return -1;
        else
        return smax;
        
        
    }
}
