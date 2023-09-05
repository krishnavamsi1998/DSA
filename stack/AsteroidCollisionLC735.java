//O(n),O(n)
//neetcode
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack=new Stack<>();

        for(int a : asteroids)
        {
            //collision
            while(!stack.isEmpty() && a<0 && stack.peek()>0 )
            {
                    if(stack.peek() + a <0)
                        stack.pop();
                    else if( stack.peek() + a >0)
                    //destroying astriod
                        a=0;
                    else if ( stack.peek() + a ==0)
                    {
                        a=0;
                        stack.pop();
                    }

                   
            }
            //when no collision occurs
             if(a!=0)
                 stack.push(a);

        }

            //transfer stack elements to res
            int res[]=new int[stack.size()];
            
            for(int i=res.length-1;i>=0;i--)
            {
                res[i]=stack.pop();
            }

            return res;
            
        
    }
}
