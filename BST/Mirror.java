public class Mirror {
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
    
        public static void preorder(Node root) { // O(n)
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }
    
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static Node createMirror(Node root){
            if(root == null){
                return null;
            }

            Node leftMirror = createMirror(root.left);
            Node rightMirror = createMirror(root.right);

            root.left = rightMirror;
            root.right = leftMirror;

            return root;
        }
    
    
    

    
        public static void main(String[] args) {
            //int values[] = { 5, 1, 3, 4, 2, 7 };
            int values[] = {8, 5, 3, 6, 10, 11};
            Node root = null;
    
            for (int i = 0; i < values.length; i++) {
                root = insert(root, values[i]);
            }
            
            root = createMirror(root);
            preorder(root);
    
            /* if (search(root, 1)) {
                System.out.println("found");
            } else {
                System.out.println("not found");
            }
    
    
            root = delete(root, 4);
            System.out.println();
    
            inorder(root); */
        }
    }
    

    

