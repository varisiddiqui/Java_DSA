import java.util.Queue;
import java.util.LinkedList;


public class MirrorByme {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.data) {
            // left subtree
            root.left = insert(root.left, val);
        }

        if (val > root.data) {
            // right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) { // O(n)
        if (root == null) {
            // System.out.print("-1 ");
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void mirror(Node root){
        if(root == null){
            return;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirror(root.left);
        mirror(root.right);
    
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
        //int values[] = { 5, 1, 3, 4, 2, 7 };
        int values[] = {8, 5, 3, 6, 10, 11};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        
        mirror(root);
        levelOrder(root);
        inorder(root);
        System.out.println();
    
}
}
