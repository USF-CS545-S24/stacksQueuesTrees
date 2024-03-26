package binaryTrees.exercises03_26;

import queues.ArrayQueue;
import queues.Queue;

public class BinaryTree {

    /** An inner class representing a node in a binary tree */
    private class BinaryTreeNode {
        int data; // value stored at the node
        BinaryTreeNode left; // left subtree
        BinaryTreeNode right; // right subtree

        BinaryTreeNode(int newData) {
            data = newData;
        }
    } // end of class BinaryTreeNode

    private BinaryTreeNode root; // the root of the tree

    public BinaryTree() {
        root = null; // initially, the tree is empty
    }

    /** Print a binary tree (preorder) */
    public void printPreorder() {
        printPreorder(root);
    }

    public String serializeUsingPreorder() {
        return serializeUsingPreorder(root);
    }


    /** * Print nodes of the binary tree using preorder traversal
     */
    private void printPreorder(BinaryTreeNode root) {
        if (root != null) {
            System.out.print(" " + root.data + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    /**
     * Prints nodes using preorder traversal, implemented iteratively.
     */
    public void printPreorderIterative() {
        if (root == null)
            return;
        Stack stack = new ArrayStack();
        BinaryTreeNode current = root;
        stack.push(current);
        while (!stack.empty()) {
            // FILL IN CODE:

        }
    }

    /**
     * Serializes the given binary tree using preorder traversal. Uses / to represent a null node.
     * @param root root of the tree
     * @return a string representing the tree, generated using preorder traversal
     * and using with / to print null nodes.
     *
     */
    private String serializeUsingPreorder(BinaryTreeNode root) {
        StringBuilder sb = new StringBuilder();
        // FILL IN CODE


        return sb.toString();
    }


   public void printNodesByLevel() {
        // FILL IN CODE:
       // Print node values level by level, starting from the top level
       Queue queue = new ArrayQueue(20);
       queue.enqueue(root);
       //while (!queue.empty()) {
            // FILL IN CODE
       //}
       System.out.println();
   }

    public void createSampleTree() {
        // Note: this is not a binary search tree, just a binary tree
        root = new BinaryTreeNode(5);
        BinaryTreeNode node1 = new BinaryTreeNode(10);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(35);
        BinaryTreeNode node4 = new BinaryTreeNode(3);
        BinaryTreeNode node5 = new BinaryTreeNode(18);
        BinaryTreeNode node6 = new BinaryTreeNode(29);
        BinaryTreeNode node7 = new BinaryTreeNode(6);
        BinaryTreeNode node8 = new BinaryTreeNode(5);
        BinaryTreeNode node9 = new BinaryTreeNode(1);
        BinaryTreeNode node10 = new BinaryTreeNode(9);

        root.right =  node1;
        root.left = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node3.left = node7;
        node4.right = node8;
        node5.right = node9;
        node9.left = node10;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createSampleTree();
       // tree.printPreorderIterative();
        System.out.println();
        // System.out.println(tree.serializeUsingPreorder());
        // System.out.println();
        // tree.printNodesByLevel();
    }
}
