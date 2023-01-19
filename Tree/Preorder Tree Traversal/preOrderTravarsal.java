public class preOrderTravarsal {

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

    public static void preOrderTravarsal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(" " + root.data);
        preOrderTravarsal(root.left);
        preOrderTravarsal(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binararyTree obj = new binararyTree();
        Node root = obj.buildTree(nodes);

        preOrderTravarsal(root);

    }

}
