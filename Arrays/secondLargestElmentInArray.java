//O(n),O(1)
// In a single traversal
class Solution {
    int print2largest(int arr[], int n) {
        
        int fmax,smax;
        fmax=smax=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>fmax)
            {
                smax=fmax;
                fmax=arr[i];
            }
            else if(arr[i]>smax && arr[i]!=fmax)
                smax=arr[i];
        }
        
        if(smax==Integer.MIN_VALUE)
            return -1;
        else
            return smax;
        
    }
}
