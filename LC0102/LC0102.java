package com.company.LC0102;

import java.util.*;

public class LC0102 {
    static class TreeNode {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> queNode = new LinkedList<TreeNode>();
        queNode.offer(root);
        while (!queNode.isEmpty()){
            List<Integer> lay = new ArrayList<>();
            int k = queNode.size();
            while (k-- > 0){
                TreeNode temNode = queNode.poll();
                lay.add(temNode.val);
                if (temNode.left != null) queNode.offer(temNode.left);
                if (temNode.right != null) queNode.offer(temNode.right);
            }
            ans.add(lay);
        }
        return ans;
    }
    public static void main(String[] args){
        LC0102 T = new LC0102();
        TreeNode nu = null;
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        TreeNode node20 = new TreeNode(20,node15,node7);
        TreeNode node9 = new TreeNode(9);
        TreeNode node3 = new TreeNode(3,node9,node20);
        System.out.println(Arrays.toString(T.levelOrder(node15).toArray()));
    }
}
