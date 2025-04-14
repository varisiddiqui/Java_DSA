import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;
public class TopologicalSort {
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

        // 2 vertex
        graph[2].add(new Edge(2, 3, 1));

        // 3 vertex
        graph[3].add(new Edge(3, 1, 1));

        // vertex 4
        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));

        //vertex 5
        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));

    }

    public static void topSort(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                topSortUtil(graph, i, vis, s);
            }
        }

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }

    }

    public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    } 

    public static void main(String[] args) {
        int V = 6;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];// null se empty arraylist banana hai
        createGraph(graph);
        topSort(graph);

    }

    
}
