import java.util.Scanner;

// Defines the nodes we will use
class Node {
    int val;
    Node left, right;

    // Sets default, takes input item, and sets that to the node's value
    Node(int item) {
        val = item;
        // Initializes left and right pointers to null, assuming it is a leaf
        left = right = null;
    }
}

class SimpleBST {
    // Initialize object root with class Node
    Node root;

    void insert(int val) {
        root = insertNode(root, val);
        System.out.println("Node with value " + val + " added.");
    }

    // This is a recursive function that inserts nodes depending on value
    Node insertNode(Node root, int val) {
        // Base case: if an empty spot to put the node is found
        if (root == null) return new Node(val);
        // If less than root, go left
        if (val < root.val) root.left = insertNode(root.left, val);
            // Otherwise, go right
        else root.right = insertNode(root.right, val);
        return root;
    }

    void delete(int val) {
        root = deleteNode(root, val);
        System.out.println("Node with value " + val + " deleted.");
    }

    Node deleteNode(Node root, int val) {
        if (root == null) return root;
        // Checks if value is less than current node's value, if so, go left
        if (val < root.val) root.left = deleteNode(root.left, val);
            // Else go right if it is greater than the root node
        else if (val > root.val) root.right = deleteNode(root.right, val);
            // Else this is the node you are looking for
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            // Runs findMin if root.right is not null
            root.val = findMin(root.right);
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    int findMin(Node root) {
        // Traverses until left node is not null
        while (root.left != null) root = root.left;
        // When it is null, return that root so it can be appended to the slot removed from the node deletion
        return root.val;
    }

    void inorder() {
        traverseInOrder(root);
        System.out.println();
    }

    // Goes left, then parent, then right. So it is in numerical order.
    // IE 4 9 12
    void traverseInOrder(Node root) {
        if (root == null) return;
        traverseInOrder(root.left);
        System.out.print(root.val + " ");
        traverseInOrder(root.right);
    }

    // Goes parent, then left, then right. So it is like top down.
    // IE 9 4 12
    void preorder() {
        traversePreOrder(root);
        System.out.println();
    }

    void traversePreOrder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }

    // Goes left, right, then parent. This is like bottom up
    // IE 4 12 9
    void postorder() {
        traversePostOrder(root);
        System.out.println();
    }

    void traversePostOrder(Node root) {
        if (root == null) return;
        traversePostOrder(root.left);
        traversePostOrder(root.right);
        System.out.print(root.val + " ");
    }
}

// Main class and function or "method"
public class QuickBST {
    public static void main(String[] args) {
        // Initializes scanner, which is the input you use in Java
        Scanner sc = new Scanner(System.in);
        SimpleBST tree = new SimpleBST();
        int choice;

        // Gets user input
        while (true) {
            System.out.println("1) Create BST");
            System.out.println("2) Add Node");
            System.out.println("3) Delete Node");
            System.out.println("4) InOrder");
            System.out.println("5) PreOrder");
            System.out.println("6) PostOrder");
            System.out.println("7) Exit");
            System.out.print("Choice (1-7): ");
            choice = sc.nextInt();

            if (choice == 1) {
                // Creates BST with given data points 1 to 7
                int[] data = {1, 2, 3, 4, 5, 6, 7};
                tree = new SimpleBST();
                for (int val : data) tree.insert(val);
                System.out.println("BST created with nodes 1-7.");
            } else if (choice == 2) {
                System.out.print("Add value: ");
                tree.insert(sc.nextInt());
            } else if (choice == 3) {
                System.out.print("Delete value: ");
                tree.delete(sc.nextInt());
            } else if (choice == 4) {
                System.out.println("InOrder:");
                tree.inorder();
            } else if (choice == 5) {
                System.out.println("PreOrder:");
                tree.preorder();
            } else if (choice == 6) {
                System.out.println("PostOrder:");
                tree.postorder();
            } else if (choice == 7) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
        sc.close();
    }
}
