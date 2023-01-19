
/* Time complexcity is O(n^2); 
cause it traverse one node in one time 
 */
public class DiametterOfATree_1 {
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

    public static int HightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int left = HightOfTree(root.left);
        int Right = HightOfTree(root.right);
        int myHight = Math.max(left, Right) + 1;
        return myHight;
    }

    public static int DiametterOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int diametter1 = DiametterOfTree(root.left);
        int diametter2 = DiametterOfTree(root.right);
        int diametter3 = HightOfTree(root.left) + HightOfTree(root.right) + 1;
        int diametter = Math.max(diametter3, Math.max(diametter2, diametter1));
        return diametter;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binararyTree obj = new binararyTree();
        Node root = obj.buildTree(nodes);
        System.out.println(DiametterOfTree(root));

    }

}
