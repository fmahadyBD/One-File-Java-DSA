public class Print_data_In_Range_in_a_Binary_Tree {

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
        if (root.data > val) {
            // insert at left
            root.left = insert(root.left, val);
        } else {
            // insert right
            root.right = insert(root.right, val);
        }
        return root;

    }

    public static void PrintInrange(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            PrintInrange(root.left, x, y);
            System.out.print(root.data + " ");
            PrintInrange(root.right, x, y);

        } else if (root.data >= y) {
            PrintInrange(root.left, x, y);
        } else {
            PrintInrange(root.right, x, y);
        }
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println();
        PrintInrange(root, 3, 6);

    }

}
