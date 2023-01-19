public class postOrderTraversal {
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

    public static void preoder(Node nodes) {
        if (nodes == null) {
            return;

        }

        preoder(nodes.right);
        preoder(nodes.left);
        System.out.print(nodes.data + " ");

    }

    static class BuildTree {
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
        BuildTree obj = new BuildTree();
        Node root = obj.buildTree(nodes);
        preoder(root);

    }
}
