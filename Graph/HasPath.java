import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class HasPath {
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

    //O(V+E)
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]){
        if(src == dest){
            return true;
        }

        vis[src] = true;
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            //e.dest = neighbour
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }


    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // 1 vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        //graph[1].add(new Edge(1, 3, 3));

        // 2 vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        //graph[2].add(new Edge(2, 4, 4));

        // 3 vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // vertex 4
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[4].add(new Edge(4, 2, 1));

        //vertex 5
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        //vertex 6
        graph[6].add(new Edge(6, 5, 1));
    }

    public static void main(String[] args) {
        int V = 7;
        // int arr[] = new int[V];

        // Suppress unchecked warning for generic array creation

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];// null se empty arraylist banana
        createGraph(graph);
        System.out.println(hasPath(graph, 0, 5, new boolean[V]));
        
    }

}
