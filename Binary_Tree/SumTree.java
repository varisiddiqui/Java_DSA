import java.util.Queue;
import java.util.LinkedList;

public class SumTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        // sum of nodes
        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int leftsum = sumOfNodes(root.left);
            int rightsum = sumOfNodes(root.right);
            return leftsum + rightsum + root.data;
        }

        public static Node sumTree(Node root) {//O(n^2)

            if (root == null) {
                return null;
            }

            int sum = sumOfNodes(root) - root.data;
            Node node = new Node(sum);
            node.left = sumTree(root.left);
            node.right = sumTree(root.right);

            return node;

        }

        public static void levelOrder(Node root){//O(n)
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    } else{
                        q.add(null);
                    }
                } else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }

            }
        }
    

        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);

            Node sumRoot = sumTree(root);
            levelOrder(sumRoot);
        }


}
