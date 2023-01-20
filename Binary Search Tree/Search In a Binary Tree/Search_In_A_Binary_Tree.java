import java.util.Scanner;

public class Search_In_A_Binary_Tree {

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

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println();
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key for searching\n");
        key=sc.nextInt();
        if (search(root, key)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Fond");
        }
        sc.close();
    }


}
