//O(n),O(n)

class Solution {
    
    boolean arraySortedOrNot(int[] arr, int n)
    {
    return isSorted(arr,0);
    }
    
    boolean isSorted(int[] arr,int i)
    {
        //base condition
        if(i==arr.length-1)
        return true;
        
        return arr[i]<=arr[i+1] && isSorted(arr,i+1);
    }
}
