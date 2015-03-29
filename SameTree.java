/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class SameTree {

    public static void main(String args[]) {
        SameTree s = new SameTree();
//        Utils.TreeNode t = new Utils.TreeNode(1);

//        s.maxDepth(t);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) 
            return p == q;
        else
            return (p.val == q.val)&&isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
    }
}

class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }