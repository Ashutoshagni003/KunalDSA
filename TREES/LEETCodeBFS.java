package TREES;

import java.util.*;

public class LEETCodeBFS {
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
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };


   //leet code 120

//    public List<List<Integer>> levelOrder(TreeNode root)
//    {
//        List<List<Integer>>al=new ArrayList<>();
//        pre(root,0,al);
//        return al;
//    }
//    public static void pre(TreeNode root,int l,List<List<Integer>>al)
//    {
//        if(root==null)
//            return;
//        if(al.size()==l)
//        {
//            List<Integer>li=new ArrayList<>();
//            li.add(root.val);
//            al.add(li);
//        }
//        else
//            al.get(l).add(root.val);
//        pre(root.left,l+1,al);
//        pre(root.right,l+1,al);
//    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }



        return result;
    }


//     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        if (root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double averageVal = 0;
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                averageVal += currentNode.val;

                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
//            double sum = 0;
//            for (int i = 0; i < currentLevel.size(); i++) {
//                sum = sum + currentLevel.get(i);
//            }
            double average = averageVal / currentLevel.size();
            res.add(average);
//            result.add(currentLevel);
        }

        return res;
    }
    //     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public TreeNode googleSuccesor(TreeNode root,int target) {

        if (root == null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
                TreeNode currentNode = queue.poll();
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
                if(target == currentNode.val){
                    break;
                }
        }
        return queue.peek();
    }
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null){
            return result;
        }

//        Queue<TreeNode> queue = new LinkedList<>();
        Deque<TreeNode> deq = new LinkedList<>();
        deq.offer(root);
        int level = 0;

        while(!deq.isEmpty()){
            int levelSize = deq.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode;
                if(level %2 != 0 ){
                    currentNode = deq.pollLast();
                }else{
                    currentNode = deq.pollFirst();
                }
                currentLevel.add(currentNode.val);
                if(level %2 != 0 ){
                    if(currentNode.right != null){
                        deq.offerFirst(currentNode.right);
                    }
                    if(currentNode.left != null){
                        deq.offerFirst(currentNode.left);
                    }

                }else{
                    if(currentNode.left != null){
                        deq.offerLast(currentNode.left);
                    }
                    if(currentNode.right != null){
                        deq.offerLast(currentNode.right);
                    }
                }

            }
            level++;
            result.add(currentLevel);
        }




        return result;
    }

//    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

            List<List<Integer>> result = new ArrayList<>();

            if (root == null){
                return result;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while(!queue.isEmpty()){
                int levelSize = queue.size();
                List<Integer> currentLevel = new ArrayList<>(levelSize);
                for (int i = 0; i < levelSize; i++) {
                    TreeNode currentNode = queue.poll();
                    currentLevel.add(currentNode.val);

                    if(currentNode.left != null){
                        queue.offer(currentNode.left);
                    }
                    if(currentNode.right != null){
                        queue.offer(currentNode.right);
                    }
                }
                result.add(0,currentLevel);
            }
        return result;

    }
//    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public Node connect(Node root) {
//
//        if (root == null){
//            return null;
//        }
//
//        Queue<Node> queue = new LinkedList<>();
//        queue.offer(root);
//        root.next = null;
//        while(!queue.isEmpty()){
//            int levelSize = queue.size();
//            Node currentNode = null;
//            for (int i = 0; i < levelSize; i++) {
//                currentNode = queue.poll();
//                currentNode.next = queue.peek();
//
//                if(currentNode.left != null){
//                    queue.offer(currentNode.left);
//                }
//                if(currentNode.right != null){
//                    queue.offer(currentNode.right);
//                }
//            }
//            currentNode.next = null;
//        }
//        return root;
//    }
    public Node connect(Node root) {

        if(root == null){
            return null;
        }
        Node currentNode = root;
        root.next = null;
        Node leftMost = root.left;
        while(currentNode.left != null){
            currentNode.left.next = currentNode.right;
            if(currentNode.next == null ){
                currentNode.right.next = null;
            }else{
                currentNode.right.next = currentNode.next.left;
            }
            if(currentNode.next == null){
                currentNode = leftMost;
                leftMost = currentNode.left;
            }else{
                currentNode = currentNode.next;
            }

        }

        return root;
    }
//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        if(root == null){
//            return res;
//        }
//        TreeNode currentNode = root;
//        while(currentNode != null){
//            res.add(currentNode.val);
//            if(currentNode.right != null){
//                currentNode = currentNode.right;
//            }else{
//                currentNode = currentNode.left;
//            }
//        }
//        return res;
//    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode currentNode = root;

        while(!queue.isEmpty()){
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                currentNode = queue.poll();

                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            res.add(currentNode.val);
        }

        return res;
    }



    public boolean isCousins(TreeNode root, int x, int y) {

        TreeNode xx = findNode(root,x);
        TreeNode yy = findNode(root,y);

        return (level(root,xx,0) == level(root,yy,0) &&(!isSibling(root,xx,yy)));
    }
    TreeNode findNode(TreeNode node,int x){
        if(node == null){
            return null;
        }
        if(node.val == x){
            return node;
        }
        TreeNode n = findNode(node.left , x);
        if( n!= null){
            return n;
        }
        return (findNode(node.right , x));
    }

    boolean isSibling(TreeNode node,TreeNode x,TreeNode y){
        if(node == null){
            return false;
        }

        return ((node.left == x && node.right == y)||(node.left == y && node.right == x)|| (isSibling(node.left,x,y)) || (isSibling(node.right,x,y)));

    }
    int level(TreeNode node,TreeNode x,int lvl){
        if(node == null){
            return 0;
        }
        if(node == x){
            return lvl;
        }
        int n = level(node.left,x,lvl+1);
        if(n != 0 ){
            return n;
        }
        return(level(node.right,x,lvl+1));
    }




//    public boolean isSymmetric(TreeNode root) {
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root.left);
//        queue.add(root.right);
//
//        while(!queue.isEmpty()){
//            TreeNode left = queue.poll();
//            TreeNode right = queue.poll();
//            if(left == null && right == null){
//                continue;
//            }
//            if(left == null || right == null){
//                return false;
//            }
//            if(left.val != right.val){
//                return false;
//            }
//            queue.add(left.left);
//            queue.add(right.right);
//            queue.add(left.right);
//            queue.add(right.left);
//
//        }
//        return true;
//    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode r1, TreeNode r2){
        if(r1 == null && r2 == null) return true;
        if(r1 ==null || r2 == null) return false;
        return r1.val == r2.val && helper(r1.left, r2.right) && helper(r1.right, r2.left);
    }


}
