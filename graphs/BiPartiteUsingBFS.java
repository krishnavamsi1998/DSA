//O(V+E),O(V)

class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
       
        //take a colored array
        int color[]=new int[V];
        //fill with -1
        for(int i=0;i<V;i++)
        {
            color[i]=-1;
        }
        
        //for each component check
         for(int i=0;i<V;i++)
        {
            if(color[i]==-1)
            {
            if(check(i,V,color,adj)==false)
            return false;
            }
        }
        return true;
    }
    
    public boolean check(int i,int V,int[] color,ArrayList<ArrayList<Integer>>adj)
    {
     Queue<Integer> q=new LinkedList<Integer>();
     q.add(i);
     color[i]=0;
     
     while(!q.isEmpty())
     {
         int node=q.poll();
         
         //try finding adj nde of node
         for(int adjNode:adj.get(node))
         {
            if(color[adjNode]==-1)
            {
                //put opp color of adj node
                color[adjNode]=1-color[node];
                q.add(adjNode);
                
            }
            //if same color 
            else if(color[adjNode]==color[node])
            return false;
         }
     
     }
     return true;
    }
}
