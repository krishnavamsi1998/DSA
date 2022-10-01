class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        // create res list and visited array
    
        ArrayList<Integer> res=new ArrayList<>();
        
        boolean[] vis=new boolean[V+1];
        
        dfs(0,res,vis,adj);
        
        return res;
        
    }
    
    void dfs(int node,ArrayList<Integer> res,boolean[] vis, ArrayList<ArrayList<Integer>> adj)
    {
        
        res.add(node);
        vis[node]=true;
        
        for(int adjNode:adj.get(node))
        {
            if(vis[adjNode]==false)
            {
                dfs(adjNode,res,vis,adj);
            }
        }
    }
    
}
