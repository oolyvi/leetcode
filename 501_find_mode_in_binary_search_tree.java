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
    private Integer prev = null;
    private int count = 0;
    private int maxCount = 0;

    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        inorder(node.left, list);

        if (prev == null || node.val != prev) {
            count = 1;
            prev = node.val;
        } else {
            count++;
        }

        if (count > maxCount) {
            maxCount = count;
            list.clear();
            list.add(node.val);
        } else if (count == maxCount) {
            list.add(node.val);
        }

        inorder(node.right, list);
    }
}
