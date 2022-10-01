//O(N),O(N)

class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
       
        // make a visited array
        boolean[] vis=new boolean[V+1];
        
        //for each node in evry component recurse
        
        for(int i=0;i<V;i++)
        {
         if(!vis[i])
         {
            if(cycle(i,-1,vis,adj))
            return true;
         }
         
        }
        //if not found for any component 
        return false;
    }
    
    boolean cycle(int node,int parent,boolean[] vis,ArrayList<ArrayList<Integer>> adj)
    {
        vis[node]=true;
        
        for(int adjNode:adj.get(node))
        {
            //logic 
            if(vis[adjNode] && adjNode!=parent)
            return true;
            else if(!vis[adjNode])
            {
            if(cycle(adjNode,node,vis,adj))
            return true;
            }
        }
        
        return false;
    }
    
}
