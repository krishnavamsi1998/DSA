//O(N+E),O(N)+O(N)
class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        
        //make adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < m; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]); 
        }
        
        //take distance array which stores the shortest distnace
        // from each vertex
        int[] dist=new int[n];
        
        Queue<Integer> q=new LinkedList<>();
        
        //initially fill each vertex with Max Value
       for(int i=0;i<n;i++){
            dist[i]= Integer.MAX_VALUE;
        }
        
        // distance from src i.e 0 is always 0
        dist[src]=0;
        q.add(src);
        
        while(!q.isEmpty())
        {
            Integer node=q.poll();
            for(Integer adjNode:adj.get(node))
            {
                //logic 
                if(dist[node]+1<dist[adjNode])
                {
                    dist[adjNode]=dist[node]+1;
                    q.add(adjNode);
                }
               
            }
        }
        //if unreachable to any vertex place -1
         for(int i = 0; i < n; i++)
        {
            if(dist[i] == Integer.MAX_VALUE)
                dist[i] = -1;
        }
        
        return dist;
    }
}
