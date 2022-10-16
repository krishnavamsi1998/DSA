//O(N+E)+O(NlogN) , O(N)+O(N)
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        //no.of vertices 
        int n=graph.length;
        
        //make inDegree array
        int[] inDegree=new int[n];
        
        //make adj list in reverse way 
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
            
        }
        
        for(int i=0;i<n;i++)
        {
            for(int adjNode:graph[i])
            {
                adj.get(adjNode).add(i);
                inDegree[i]++;
                  
            }
        }
        
        //make queue
        Queue<Integer> q=new LinkedList<>();
        
        //add vertices which have indegree 0
        for(int i=0;i<n;i++)
        {
            if(inDegree[i]==0)
                q.add(i);
            
        }
        
        List<Integer> topoSafeNodes=new ArrayList<>();
            
        while(q.isEmpty()==false)
        {
            int node=q.poll();
            topoSafeNodes.add(node);
            
            for(Integer adjNode:adj.get(node))
            {
                inDegree[adjNode]--;
                if(inDegree[adjNode]==0)
                    q.add(adjNode);                
            }
        }
        //sort and return 
        Collections.sort(topoSafeNodes);
        return topoSafeNodes;
    }
}
