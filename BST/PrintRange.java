public class PrintRange {
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

    //print in range
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }

        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        } 

        else if(root.data < k1){
            // Only right subtree can contain values in range
            printInRange(root.right, k1, k2);
        } 

        else{
            // Only  subtree can contain values in range
            printInRange(root.left, k1, k2);
        }
    }

    public static void main(String[] args) {
        //int values[] = { 5, 1, 3, 4, 2, 7 };
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        printInRange(root, 5, 12); 
}
}
