package labMarch29;

import java.util.List;

/** Implementation of a binary search tree.
 */
class BinarySearchTree {

    /** An inner class representing a node in a BST tree */
    private class BSTNode {
        int data; // value stored at the node
        BSTNode left; // left subtree
        BSTNode right; // right subtree

        BSTNode(int newdata) {
            data = newdata;
        }

        public String toString() {
            return data + "";
        }
    }

    private BSTNode root; // the root of the tree, an instance variable of class BinarySearchTree

    BinarySearchTree() {
        root = null; // initially, the tree is empty
    }

    /**
     * Insert a given element into the BST tree
     * @param elem element to insert into the BST tree
     */
    public void insert(int elem) {
        root = insert(root, elem);
    }

    /** Serialize a binary tree (preorder and use / for a null tree) */
    public void printPreorder() {
        printPreorder(root);
    }

    /**
     * Insert elem into the tree with the given root
     * @param tree root of a tree
     * @param elem element to insert
     * @return the root of a tree that contains the new node
     */
    private BSTNode insert(BSTNode tree, int elem) {
        if (tree == null) {
            return new BSTNode(elem);
        }
        if (elem < tree.data) {
            tree.left = insert(tree.left, elem);
            return tree;
        } else {
            tree.right = insert(tree.right, elem);
            return tree;
        }
    }

    /** Print a given tree using preorder traversal
     *
     * @param root of the tree
     */
    private void printPreorder(BSTNode root) {
        if (root != null) {
            System.out.print(" " + root.data + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    /** Return a list of all nodes produced using inorder traversal
     *
     * @param root root of the tree
     * @param inorderList list of nodes
     */
    private void getNodesInorder(BSTNode root, List<BSTNode> inorderList) {
        // FILL IN CODE
    }

    /**
     * A method that changes a binary search tree so that it is "balanced",
     * using the following simple algorithm:
     * Put all the values from the tree into an ArrayList, "in order"
     * Create an empty tree and insert the elements into the tree one by one so that
     * the tree is balanced. (Hint: First insert the element in the middle of the array,
     * and then recursively insert other elements).
     * Resets the root.
     */
    public void makeBalanced() {
        // FILL IN CODE
        // Should use getNodesInorder
        // Also write a helper method that recursively finds
        // the middle of a sublist and inserts the middle value into a new tree.

    }


    /** Supposed to return true if the tree is a valid binary search tree
     * @return true if a valid BST
     */
    public boolean checkBSTWrong() {
        return checkBSTWrong(root);
    }

    /** The following method is supposed to check if a given tree is a valid
     * Binary search tree, but the logic is wrong.
     * Explain why it's wrong (given an example of a tree), and think of how to implement it correctly.
     * @return true if the tree is BST, false otherwise
     */
    private boolean checkBSTWrong(BSTNode root) {
        if (root == null)
            return true;
        if ((root.left != null) && (root.left.data >= root.data))
            return false;
        if ((root.right != null) && (root.right.data < root.data))
            return false;
        return checkBSTWrong(root.left) && checkBSTWrong(root.right);
    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(6);
        tree.insert(0);
        tree.insert(10);
        tree.insert(8);
        tree.insert(12);
        tree.insert(16);
        tree.insert(25);
        /**
            1
         0      6
                   10
                 8    12
                          16
                             25
         */

        tree.printPreorder();
        System.out.println();
        tree.makeBalanced();
        tree.printPreorder();
    }
}
