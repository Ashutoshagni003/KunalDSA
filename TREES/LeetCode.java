package TREES;

public class LeetCode {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public static void main(String[] args) {
        TreeNode leftChild1 = new TreeNode(2);

        // Create the right child node
        TreeNode rightChild1 = new TreeNode(3);

        // Create the root node with left and right children
        TreeNode root1 = new TreeNode(1, leftChild1, rightChild1);

        TreeNode leftChild2 = new TreeNode(2);

        // Create the right child node
        TreeNode rightChild2 = new TreeNode(3);

        // Create the root node with left and right children
        TreeNode root2 = new TreeNode(1, leftChild2, rightChild2);

        System.out.println(isSameTree(root1,root2));



    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        // One of the nodes is null, but not both, so they are not the same
        if (p == null || q == null) {
            return false;
        }
        // Both nodes are non-null, compare their values and recursively their children
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}
