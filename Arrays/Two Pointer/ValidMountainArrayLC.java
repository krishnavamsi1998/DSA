//O(n),O(1)

class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int n=arr.length;
        
        int i=0;
        int j=n-1;
        
        if(n<3)
            return false;
        
        while(i<n-1 && arr[i+1]>arr[i])
            i++;
        while(j>0 && arr[j-1]>arr[j])
            j--;
        return j<n-1 && i>0 && i==j;
        
        
    }
}
