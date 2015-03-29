/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


public class MaxDepthBTree {

    public static void main(String args[]) {
        MaxDepthBTree s = new MaxDepthBTree();
//        Utils.TreeNode t = new Utils.TreeNode(1);

//        s.maxDepth(t);
    }

    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max (maxDepth(root.left) + 1, maxDepth(root.right) + 1 );
        }

}

//class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }



