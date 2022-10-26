public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int i=1;
        int j=n;
        while(i<=j)
        {
            //cal mid
            int mid=i+(j-i)/2;
            
            //check
            if(guess(mid)==0)
                return mid;
            else if(guess(mid)==1)
                i=mid+1;
            else
                j=mid-1;            
                
        }
        //just to compile
        return 1;        
        
    }
}
