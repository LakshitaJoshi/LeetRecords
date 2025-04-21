/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> finalAns = new ArrayList<>();
        List<Integer> ls = new ArrayList<>(); // flat level-order list

        if (root == null) {
            return finalAns;
        }

        q.add(root);
        while (!q.isEmpty()) {
            int levels = q.size();
            List<Integer> subLevels = new ArrayList<>();
            for (int i = 0; i < levels; i++) {
                TreeNode current = q.remove();
                subLevels.add(current.val);
                ls.add(current.val);

                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }
            finalAns.add(subLevels);
        }
        return finalAns;
    }
}
