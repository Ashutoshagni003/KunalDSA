package TREES;

import com.sun.source.tree.Tree;

import java.util.Arrays;

public class LEETCodeDFS {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){

        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int diameter =0;
    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);


        diameter = Math.max(diameter, leftDepth + rightDepth);


        return Math.max(leftDepth, rightDepth) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;

    }

    int depthMax = 0;

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        depthMax = Math.max(maxDepth(root.left),maxDepth(root.right))+1;

        return depthMax;


    }
    public void insert(int value){
        root = insert(value,root);
    }

    private TreeNode root;
    public TreeNode insert (int value, TreeNode node){
        if(node == null){
            node = new TreeNode(value);
            return node;
        }
        if(value < node.val){
            node.left = insert(value,node.left);
        }
        if(value > node.val){
            node.right = insert(value,node.right);
        }
//        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }
    private TreeNode rotate(TreeNode node){
        if(height(node.left) - height(node.right) > 1){
            //left heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                //left left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                //left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left) - height(node.right) < -1){
            //right heavy
            if(height(node.right.left) - height(node.right.right) < 0){
                //right right case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                // right left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    public TreeNode rightRotate(TreeNode p){
        TreeNode c = p.left;
        TreeNode t = c.right;

        c.right = p;
        p.left = t;

//        p.height = Math.max(height(p.left), height(p.right)+1);
//        c.height = Math.max(height(c.left), height(c.right)+1);
        return c;
    }
    public TreeNode leftRotate(TreeNode c){
        TreeNode p = c.right;
        TreeNode t = p.left;


        p.left = c;
        c.right = t;

//        p.height = Math.max(height(p.left), height(p.right)+1);
//        c.height = Math.max(height(c.left), height(c.right)+1);
        return p;
    }
    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        populateSorted(nums,0,nums.length);
        return root;
    }
    public void populateSorted(int[] nums,int start,int end){
        if(start>= end){
            return;
        }
        int mid = (start + end) /2;
        this.insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);
    }

    public int height(){
        return height(root);
    }
    int HEIGHT = 0;

    public int height(TreeNode node){
//        if(node == null){
//            return -1;
//        }
//        return node.height;
        if(root == null){
            return 0;
        }

        int LeftHeight = height(node.left);
        int rightHeight = height(node.right);
         HEIGHT = Math.max(LeftHeight ,rightHeight)+1;

        return HEIGHT;

    }


    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        TreeNode current = root;
        while(current != null){
            if(current.left != null){
                TreeNode temp = current.left;
                while (temp.right != null){
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }

    public boolean isValidBST(TreeNode root){
        return helper(root,null,null);
    }
    public boolean helper(TreeNode node,Integer low,Integer high){
        if(node == null){
            return true;
        }
        if(low != null && node.val <= low ){
            return false;
        }

        if(high != null && node.val >= high ){
            return false;
        }

        Boolean leftTree = helper(node.left , low , node.val);
        Boolean rightTree = helper(node.right , node.val,high);

        return leftTree && rightTree;

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }

        if( root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left != null && right != null){
            return root;
        }
        return left == null ? right : left ;


    }
int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return helper(root , k).val;
    }
    public TreeNode helper(TreeNode root, int k){
        if(root == null){
            return null;
        }
        TreeNode left = helper(root.left,k);
        if( left != null){
            return left;
        }
        count++;
        if(count == k){
            return root;
        }
        return helper(root.right,k);
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0){
            return null;
        }
        int r = preorder[0];
        int index = 0;

        for (int i = 0; i < preorder.length; i++) {
            if(preorder[i] == r){
                index = i;
            }
        }
        TreeNode node = new TreeNode(r);
        node.left = buildTree(Arrays.copyOfRange(preorder,1,index+1) , Arrays.copyOfRange(inorder,0,index));
        node.right = buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length) , Arrays.copyOfRange(inorder,index+1,inorder.length));

        return node;


    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.val == targetSum && root.left == null && root.right == null){
            return true;
        }
        return hasPathSum(root.left , targetSum-root.val) || hasPathSum(root.right , targetSum-root.val);
    }



    int number = 0;
    int sum = 0;//495
    int finalSum = 0;//495
    public int sumNumbers(TreeNode root) {
        helperSum(root,0);
        return finalSum;
    }
    public void helperSum(TreeNode node,int sum){
        if(node == null){


            return;
        }
        sum = sum*10 + node.val;
        if(node.left == null && node.right == null){
            finalSum+= sum;
            sum = (sum-node.val)/10;
            System.out.println("sum -> "+sum+" finalSum -> "+finalSum);
            return;
        }

        helperSum(node.left,sum);
//        sum = (sum - node.val)/10;
        helperSum(node.right,sum);
        sum = (sum-node.val)/10;


    }
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helperMaxSum(root);
        return ans;
    }

    private int helperMaxSum(TreeNode node) {
        if(node == null){
            return 0;
        }
        int left = helperMaxSum(node.left);
        int right = helperMaxSum(node.right);

        left = Math.max(0,left);
        right = Math.max(0,right);

        int pathSum = left + right + node.val;
        ans = Math.max(pathSum,ans);
        return Math.max(left,right) + node.val;


    }


}
