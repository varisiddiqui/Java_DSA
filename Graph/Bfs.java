import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
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

    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0); //source = 0
        vis[0] = true;

        while(!q.isEmpty()){
            int curr = q.remove();
            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i); 

                if(vis[e.dest] == false){
                    vis[e.dest] = true;
                    q.add(e.dest);
                }
            }
            System.out.print(curr+" ");

        }
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
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

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
        bfs(graph);
        
    }

}
