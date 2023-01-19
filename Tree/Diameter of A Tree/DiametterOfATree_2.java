
/* Time complexcity is O(n); 
cause it traverse one node in one time 
 */
public class DiametterOfATree_2 {
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

    static class binararyTree {

        static int indx = -1;

        public static Node buildTree(int nodes[]) {

            indx++;
            if (nodes[indx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

    }

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diametter(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }// base case O(n)
        TreeInfo leftTI=diametter(root.left);
        TreeInfo rightTI=diametter(root.right);

        int myHight=Math.max(leftTI.ht, rightTI.ht)+1;

        int diam1=leftTI.ht+rightTI.ht+1;
        int diam2=leftTI.diam;
        int diam3=rightTI.diam;

        int myDiam = Math.max(diam1, Math.max(diam2, diam3));


        return new TreeInfo(myHight, myDiam);
      }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binararyTree obj = new binararyTree();
        Node root = obj.buildTree(nodes);
        System.out.println(diametter(root).diam);

    }

}
