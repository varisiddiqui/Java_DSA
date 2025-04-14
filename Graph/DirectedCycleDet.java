import java.util.*;
public class DirectedCycleDet {

    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0, 2, 1));

        // 1 vertex
        graph[1].add(new Edge(1, 0, 1));
        
        // 2 vertex
        graph[2].add(new Edge(2, 3, 1));
        

        // 3 vertex
        graph[3].add(new Edge(3, 1, 0));
       
    }

    public static boolean isCycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(isCycleUtil(graph, i, vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[], int curr, boolean vis[], boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){ //Cycle
                return true;
            }
            else if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack))
            return true;
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];// null se empty arraylist banana hai
        createGraph(graph);
        System.out.println(isCycle(graph));

    }
    
}
