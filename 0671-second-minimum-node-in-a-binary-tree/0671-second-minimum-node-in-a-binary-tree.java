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
    public int findSecondMinimumValue(TreeNode root) {
        if (root.left == null) return -1;

        Queue<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.add(root);
        int secondMin = Integer.MAX_VALUE;
        int minVal = root.val;
        boolean found = false;

        while (!nodesQueue.isEmpty()) {
            TreeNode currentNode = nodesQueue.poll();

            if (currentNode.left != null) {
                nodesQueue.add(currentNode.left);
                nodesQueue.add(currentNode.right);

                if (currentNode.left.val > minVal) {
                    secondMin = Math.min(secondMin, currentNode.left.val);
                    found = true;
                }

                if (currentNode.right.val > minVal) {
                    secondMin = Math.min(secondMin, currentNode.right.val);
                    found = true;
                }
            }
        }

        return found ? secondMin : -1;
    }
}