public class Height {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }

        int lcount = count(root.left);
        int rcount = count(root.right);
        return lcount+rcount+1;
    }

    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);
        return leftsum+rightsum+root.data;
    }

    static class Info{
        int diam;
        int ht;
        Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){//O(n)
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(diam, ht);

    }

    public static int diameter2(Node root){ //O(n^2)
        if(root == null){
            return 0;
        }
        
        int leftDiam = diameter2(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter2(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt+rightHt+1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        System.out.println("height ="+height(root));
        System.out.println("No of Nodes ="+count(root));
        System.out.println("sum of Nodes ="+sumOfNodes(root));
        System.out.println("diameter ="+diameter2(root));

        System.out.println(diameter(root).diam);
        System.out.println(diameter(root).ht);

    }
    
}
