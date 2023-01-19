/* Time complexcity is O(n); 
cause it traverse one node in one time 
 */
public class smOfNodes {

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

    public static int sumOfNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = sumOfNode(root.left);
        int RightNodes = sumOfNode(root.right);
        return leftNodes + RightNodes + root.data;
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

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binararyTree obj = new binararyTree();
        Node root = obj.buildTree(nodes);
        System.out.println(sumOfNode(root));

    }

    
}
