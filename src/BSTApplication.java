import java.util.Scanner;

//this is the class that defines the Nodes that exist in the tree
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int item) {
        // this is the value the user puts in.
        val = item;
        //this sets the initial value to null for left and right connections.
        left = right = null;
    }
}

class BST {
    TreeNode root;

    // Insert a node into the BST
    public void insert(int val) {
        root = insertRec(root, val);
    }

    // Recursive insert function
    private TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        if (val < root.val)
            root.left = insertRec(root.left, val);
        else if (val > root.val)
            root.right = insertRec(root.right, val);
        return root;
    }

    // Delete a node from the BST
    public void delete(int val) {
        root = deleteRec(root, val);
    }

    // Recursive delete function
    private TreeNode deleteRec(TreeNode root, int val) {
        if (root == null)
            return root;
        if (val < root.val)
            root.left = deleteRec(root.left, val);
        else if (val > root.val)
            root.right = deleteRec(root.right, val);
        else {
            // Node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            // Node with two children: Get the inorder successor
            root.val = minValue(root.right);
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.val);
        }
        return root;
    }

    // Find the minimum value in the BST
    private int minValue(TreeNode root) {
        int minv = root.val;
        while (root.left != null) {
            minv = root.left.val;
            root = root.left;
        }
        return minv;
    }

    // In-order traversal
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.val + " ");
            inorderRec(root.right);
        }
    }

    // Pre-order traversal
    public void preorder() {
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Post-order traversal
    public void postorder() {
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(TreeNode root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.val + " ");
        }
    }
}

public class BSTApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST bst = new BST();
        int choice;

        do {
            System.out.println("1) Create a binary search tree");
            System.out.println("2) Add a node");
            System.out.println("3) Delete a node");
            System.out.println("4) Print nodes by InOrder");
            System.out.println("5) Print nodes by PreOrder");
            System.out.println("6) Print nodes by PostOrder");
            System.out.println("7) Exit program");
            System.out.print("Enter your choice (1-7): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Create BST with given data (1,2,3,4,5,6,7)
                    int[] data = {1, 2, 3, 4, 5, 6, 7};
                    bst = new BST(); // Reset the tree
                    for (int val : data) {
                        bst.insert(val);
                    }
                    System.out.println("Binary search tree created with nodes 1-7.");
                    break;
                case 2:
                    System.out.print("Enter the value to add: ");
                    int valToAdd = scanner.nextInt();
                    bst.insert(valToAdd);
                    System.out.println("Node " + valToAdd + " added to the binary search tree.");
                    break;
                case 3:
                    System.out.print("Enter the value to delete: ");
                    int valToDelete = scanner.nextInt();
                    bst.delete(valToDelete);
                    System.out.println("Node " + valToDelete + " deleted from the binary search tree.");
                    break;
                case 4:
                    System.out.println("InOrder traversal:");
                    bst.inorder();
                    break;
                case 5:
                    System.out.println("PreOrder traversal:");
                    bst.preorder();
                    break;
                case 6:
                    System.out.println("PostOrder traversal:");
                    bst.postorder();
                    break;
                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select an option between 1 and 7.");
            }
            System.out.println();
        } while (choice != 7);

        scanner.close();
    }
}
