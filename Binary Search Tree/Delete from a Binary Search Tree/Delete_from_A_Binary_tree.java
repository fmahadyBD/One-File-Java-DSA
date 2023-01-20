import java.util.Scanner;

public class Delete_from_A_Binary_tree {

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

    public static boolean search(Node root, int val) {
        if (root == null) {
            return false;
        }

        if (root.data > val) {
            return search(root.left, val);
        } else if (root.data == val) {

            return true;

        } else {

            return search(root.right, val);
        }
    }

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // case 1;
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2
            else if (root.left == null) {
                return root.right;// case right is not null, and we cheecked it in case 1

            }

            // case 3.. finding the sccessor
            Node IS = insuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    public static Node insuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;

    }

    
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println();
        int key;
        Scanner sc = new Scanner(System.in);
        inOrder(root);
        System.out.println("\nEnter the key for Deleting\n");
        key = sc.nextInt();
        delete(root,key);
        System.out.println();
        inOrder(root);
        sc.close();
    }

}
