//O(logn),O(1)
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=1,r=n;

        while(true){

            //cal mid
            int mid=l+(r-l)/2;
            int res=guess(mid);
            if(res>0)
            l=mid+1;
            else if(res<0)
            r=mid-1;
            // correct guess
            else
            return mid;

        }
    }
}
