//O(n2),O(n)

class Solution {
    public int maxPoints(int[][] points) {
        
        int n=points.length;
        // two pints always will be on same line
        if(n<=2)
            return n; 

        int res=1;
        
        for(int i=0;i<points.length;i++)
        {
            Map<Double,Integer> map=new HashMap<>();
            
            int x1=points[i][0];
            int y1=points[i][1];
            for(int j=0;j<points.length;j++)
            {
                if(i==j)
                    continue;
                double slope=Integer.MAX_VALUE;
                
                int x2=points[j][0];
                int y2=points[j][1];
                //vertical line , problem while dividing so infinity
                
                if(x2!=x1)                               
                    slope=(y2-y1)* 1.0d / (x2 - x1) *1.0d;                   
                
                int count=map.getOrDefault(slope, 1)+1;
                map.put(slope, count);
                res=Math.max(res, count);


            }
        }

        return res;

    }
}
