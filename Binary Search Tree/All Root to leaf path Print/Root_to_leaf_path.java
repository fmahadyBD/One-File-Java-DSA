import java.util.ArrayList;

public class Root_to_leaf_path {
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

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");

        }
        System.out.println();

    }

    public static void root_to_leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        // leaf
        if (root.left == null && root.right == null) {
            printPath(path);
        } else {
            root_to_leaf(root.left, path);
            root_to_leaf(root.right, path);
        }
        path.remove(path.size() - 1);

    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        root_to_leaf(root, new ArrayList<>());
        System.out.println();
    }

}
