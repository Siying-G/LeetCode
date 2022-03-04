package com.company.LC0257;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0257 {
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
    public List<String> binaryTreePaths(TreeNode root) {
        String str = new String();
        List<String> ans = new ArrayList<String>();
        if (root == null) return ans;
        str = str + (root.val+"");
        if (root.left == null && root.right == null){
            ans.add(str);
            return ans;
        }
        if (root.left == null){
            List<String> strRtght = binaryTreePaths(root.right);
            str = str + "->";
            for (String strR : strRtght){

                String tem = str.concat(strR);
                ans.add(tem);
            }
            return ans;
        }
        if (root.right == null){
            List<String> strLeft = binaryTreePaths(root.left);
            str = str + "->";
            for (String strL : strLeft){
                String tem = str.concat(strL);
                ans.add(tem);
            }
            return ans;
        }
        List<String> strLeft = binaryTreePaths(root.left);
        str = str + "->";
        for (String strL : strLeft){
            String tem = str.concat(strL);
            ans.add(tem);
        }
        List<String> strRtght = binaryTreePaths(root.right);
        for (String strR : strRtght){
            String tem = str.concat(strR);
            ans.add(tem);
        }
        return ans;
    }
    public static void main(String[] args){
        LC0257 T = new LC0257();
        TreeNode nu = null;
        TreeNode node5 = new TreeNode(35);
        TreeNode node2 = new TreeNode(2,null,node5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node1 = new TreeNode(1,node2,node3);
        System.out.println(Arrays.toString(T.binaryTreePaths(node1).toArray()));
    }
}
