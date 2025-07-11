public class LargestSizeBSTinBT {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        Info(boolean isBSt, int size, int min, int max){
            this.isBST = isBSt;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }  

    public static int maxSizeBSt = 0;

    public static Info largestBST(Node root){
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
                                                          //yahan ham har node ke corresponding uska info bana rahe hai jikse pass 4 properties hain
        Info leftInfo = largestBST(root.left);            //ye root ke left ke liye bana
        Info rightInfo = largestBST(root.right);          //ye root ke right ke liye bana
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size, min, max);
        }

        if(leftInfo.isBST && rightInfo.isBST){  //this is only true condition
            maxSizeBSt = Math.max(maxSizeBSt, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);


    }

      

    public static void main(String[] args) {
        Node root = new Node(50); //yahan har value ke liye node bani jisme 3 properties hai har ek value ki
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        largestBST(root);
        System.out.println("Maximum size :"+maxSizeBSt); 
        
    }
    
}
