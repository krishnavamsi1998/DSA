class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // modified flower bed with appending zero at start and end

        int m=flowerbed.length+2;
        int[] arr=new int[m];

        arr[0]=0;
        arr[m-1]=0;

        for(int i=1;i<m-1;i++)
        {
            arr[i]=flowerbed[i-1];
        }

       
        for(int i=1;i<m-1;i++)
        {
            //check if 3 consecutive empty places
            if(arr[i-1]==0 && arr[i]==0 && arr[i+1]==0){
            //place flower            
            arr[i]=1;
            n--;
            }
        }
       // if all flowers placed      
        return n<=0;

    }
}
